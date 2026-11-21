package net.lehraan.fancyaditions.entity.client;

import net.lehraan.fancyaditions.FancyAditions;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModModelLayerLocations {
    public static final ModelLayerLocation CRATE=
            new ModelLayerLocation(Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID,"crate"),"main");
    public static final ModelLayerLocation ANIMATRONIC=
            new ModelLayerLocation(Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID,"animatronic"),"main");
    public static final ModelLayerLocation BIGBEETLE=
            new ModelLayerLocation(Identifier.fromNamespaceAndPath(FancyAditions.MOD_ID,"bigbeetle"),"main");
}
