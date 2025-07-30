package net.mcreator.dohess.network;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.dohess.DohessMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DohessModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		DohessMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
		DohessMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().world.isRemote())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().world.isRemote())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().world.isRemote())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.AbleWalk = original.AbleWalk;
			clone.PlayerMessage = original.PlayerMessage;
			clone.PlayerRank = original.PlayerRank;
			clone.PlayerSquad = original.PlayerSquad;
			clone.PlayerUser = original.PlayerUser;
			if (!event.isWasDeath()) {
				clone.handcuffed = original.handcuffed;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().world.isRemote()) {
				WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
				WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
				if (mapdata != null)
					DohessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					DohessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().world.isRemote()) {
				WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
				if (worlddata != null)
					DohessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "dohess_worldvars";
		public String MPSquad1 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String MPSquad2 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String MPSquad3 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String MPSquad4 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String MPSquad5 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String MPSquad6 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String MPSquad7 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String MPSquad8 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public double PD = 0.0;
		public String Rank1 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank10 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank11 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank12 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank13 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank14 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank15 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank16 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank2 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank3 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank4 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank5 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank6 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank7 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank8 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String Rank9 = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String SGSquad1 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SGSquad2 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SGSquad3 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SGSquad4 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SGSquad5 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SGSquad6 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SGSquad7 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SGSquad8 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad1 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad2 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad3 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad4 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad5 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad6 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad7 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String SLSquad8 = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public double Timer1 = 0;
		public double Timer2 = 0.0;
		public double Timer3 = 0;
		public double Timer4 = 0.0;
		public double Timer5 = 0;
		public String TimerName1 = "{\"text\":\"No Timer\",\"color\":\"#424242\"}";
		public String TimerName2 = "{\"text\":\"No Timer\",\"color\":\"#424242\"}";
		public String TimerName3 = "{\"text\":\"No Timer\",\"color\":\"#424242\"}";
		public String TimerName4 = "{\"text\":\"No Timer\",\"color\":\"#424242\"}";
		public String TimerName5 = "{\"text\":\"No Timer\",\"color\":\"#424242\"}";

		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			MPSquad1 = nbt.getString("MPSquad1");
			MPSquad2 = nbt.getString("MPSquad2");
			MPSquad3 = nbt.getString("MPSquad3");
			MPSquad4 = nbt.getString("MPSquad4");
			MPSquad5 = nbt.getString("MPSquad5");
			MPSquad6 = nbt.getString("MPSquad6");
			MPSquad7 = nbt.getString("MPSquad7");
			MPSquad8 = nbt.getString("MPSquad8");
			PD = nbt.getDouble("PD");
			Rank1 = nbt.getString("Rank1");
			Rank10 = nbt.getString("Rank10");
			Rank11 = nbt.getString("Rank11");
			Rank12 = nbt.getString("Rank12");
			Rank13 = nbt.getString("Rank13");
			Rank14 = nbt.getString("Rank14");
			Rank15 = nbt.getString("Rank15");
			Rank16 = nbt.getString("Rank16");
			Rank2 = nbt.getString("Rank2");
			Rank3 = nbt.getString("Rank3");
			Rank4 = nbt.getString("Rank4");
			Rank5 = nbt.getString("Rank5");
			Rank6 = nbt.getString("Rank6");
			Rank7 = nbt.getString("Rank7");
			Rank8 = nbt.getString("Rank8");
			Rank9 = nbt.getString("Rank9");
			SGSquad1 = nbt.getString("SGSquad1");
			SGSquad2 = nbt.getString("SGSquad2");
			SGSquad3 = nbt.getString("SGSquad3");
			SGSquad4 = nbt.getString("SGSquad4");
			SGSquad5 = nbt.getString("SGSquad5");
			SGSquad6 = nbt.getString("SGSquad6");
			SGSquad7 = nbt.getString("SGSquad7");
			SGSquad8 = nbt.getString("SGSquad8");
			SLSquad1 = nbt.getString("SLSquad1");
			SLSquad2 = nbt.getString("SLSquad2");
			SLSquad3 = nbt.getString("SLSquad3");
			SLSquad4 = nbt.getString("SLSquad4");
			SLSquad5 = nbt.getString("SLSquad5");
			SLSquad6 = nbt.getString("SLSquad6");
			SLSquad7 = nbt.getString("SLSquad7");
			SLSquad8 = nbt.getString("SLSquad8");
			Timer1 = nbt.getDouble("Timer1");
			Timer2 = nbt.getDouble("Timer2");
			Timer3 = nbt.getDouble("Timer3");
			Timer4 = nbt.getDouble("Timer4");
			Timer5 = nbt.getDouble("Timer5");
			TimerName1 = nbt.getString("TimerName1");
			TimerName2 = nbt.getString("TimerName2");
			TimerName3 = nbt.getString("TimerName3");
			TimerName4 = nbt.getString("TimerName4");
			TimerName5 = nbt.getString("TimerName5");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putString("MPSquad1", MPSquad1);
			nbt.putString("MPSquad2", MPSquad2);
			nbt.putString("MPSquad3", MPSquad3);
			nbt.putString("MPSquad4", MPSquad4);
			nbt.putString("MPSquad5", MPSquad5);
			nbt.putString("MPSquad6", MPSquad6);
			nbt.putString("MPSquad7", MPSquad7);
			nbt.putString("MPSquad8", MPSquad8);
			nbt.putDouble("PD", PD);
			nbt.putString("Rank1", Rank1);
			nbt.putString("Rank10", Rank10);
			nbt.putString("Rank11", Rank11);
			nbt.putString("Rank12", Rank12);
			nbt.putString("Rank13", Rank13);
			nbt.putString("Rank14", Rank14);
			nbt.putString("Rank15", Rank15);
			nbt.putString("Rank16", Rank16);
			nbt.putString("Rank2", Rank2);
			nbt.putString("Rank3", Rank3);
			nbt.putString("Rank4", Rank4);
			nbt.putString("Rank5", Rank5);
			nbt.putString("Rank6", Rank6);
			nbt.putString("Rank7", Rank7);
			nbt.putString("Rank8", Rank8);
			nbt.putString("Rank9", Rank9);
			nbt.putString("SGSquad1", SGSquad1);
			nbt.putString("SGSquad2", SGSquad2);
			nbt.putString("SGSquad3", SGSquad3);
			nbt.putString("SGSquad4", SGSquad4);
			nbt.putString("SGSquad5", SGSquad5);
			nbt.putString("SGSquad6", SGSquad6);
			nbt.putString("SGSquad7", SGSquad7);
			nbt.putString("SGSquad8", SGSquad8);
			nbt.putString("SLSquad1", SLSquad1);
			nbt.putString("SLSquad2", SLSquad2);
			nbt.putString("SLSquad3", SLSquad3);
			nbt.putString("SLSquad4", SLSquad4);
			nbt.putString("SLSquad5", SLSquad5);
			nbt.putString("SLSquad6", SLSquad6);
			nbt.putString("SLSquad7", SLSquad7);
			nbt.putString("SLSquad8", SLSquad8);
			nbt.putDouble("Timer1", Timer1);
			nbt.putDouble("Timer2", Timer2);
			nbt.putDouble("Timer3", Timer3);
			nbt.putDouble("Timer4", Timer4);
			nbt.putDouble("Timer5", Timer5);
			nbt.putString("TimerName1", TimerName1);
			nbt.putString("TimerName2", TimerName2);
			nbt.putString("TimerName3", TimerName3);
			nbt.putString("TimerName4", TimerName4);
			nbt.putString("TimerName5", TimerName5);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !((World) world).isRemote())
				DohessMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "dohess_mapvars";

		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				DohessMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private WorldSavedData data;

		public SavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			CompoundNBT nbt = buffer.readCompoundTag();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables)
					((MapVariables) this.data).read(nbt);
				else if (this.data instanceof WorldVariables)
					((WorldVariables) this.data).read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("dohess", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null, nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putBoolean("AbleWalk", instance.AbleWalk);
			nbt.putBoolean("handcuffed", instance.handcuffed);
			nbt.putString("PlayerMessage", instance.PlayerMessage);
			nbt.putString("PlayerRank", instance.PlayerRank);
			nbt.putString("PlayerSquad", instance.PlayerSquad);
			nbt.putString("PlayerUser", instance.PlayerUser);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.AbleWalk = nbt.getBoolean("AbleWalk");
			instance.handcuffed = nbt.getBoolean("handcuffed");
			instance.PlayerMessage = nbt.getString("PlayerMessage");
			instance.PlayerRank = nbt.getString("PlayerRank");
			instance.PlayerSquad = nbt.getString("PlayerSquad");
			instance.PlayerUser = nbt.getString("PlayerUser");
		}
	}

	public static class PlayerVariables {
		public boolean AbleWalk = true;
		public boolean handcuffed = false;
		public String PlayerMessage = "\"\"";
		public String PlayerRank = "{\"text\":\"No Rank. \",\"color\":\"#424242\"}]";
		public String PlayerSquad = "[{\"text\":\"[\",\"color\":\"#636363\"},{\"text\":\"No Squad\",\"color\":\"#424242\"},{\"text\":\"] | \",\"color\":\"#636363\"},";
		public String PlayerUser = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				DohessMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity), new PlayerVariablesSyncMessage(this));
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.AbleWalk = message.data.AbleWalk;
					variables.handcuffed = message.data.handcuffed;
					variables.PlayerMessage = message.data.PlayerMessage;
					variables.PlayerRank = message.data.PlayerRank;
					variables.PlayerSquad = message.data.PlayerSquad;
					variables.PlayerUser = message.data.PlayerUser;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
