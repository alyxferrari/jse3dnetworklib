package com.emeryferrari.jse3d.network;
public class Disconnect {
	private DisconnectType type;
	public Disconnect(DisconnectType type) {
		this.type = type;
	}
	public DisconnectType getType() {
		return type;
	}
}