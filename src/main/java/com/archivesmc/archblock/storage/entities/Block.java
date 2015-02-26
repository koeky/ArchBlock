package com.archivesmc.archblock.storage.entities;

public class Block {
    private Long id;
    private Long x;
    private Long y;
    private Long z;

    private String uuid;
    private String world;

    public Block() {}

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }


    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }


    public Long getZ() {
        return z;
    }

    public void setZ(Long z) {
        this.z = z;
    }


    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}