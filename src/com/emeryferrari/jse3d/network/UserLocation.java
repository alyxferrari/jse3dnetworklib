package com.emeryferrari.jse3d.network;
import com.emeryferrari.jse3d.*;
public class UserLocation {
	private String username;
	private Point3D location;
	public UserLocation(String username, Point3D location) {
		this.username = username;
		this.location = location;
	}
	public String getUsername() {
		return username;
	}
	public Point3D getLocation() {
		return location;
	}
}