package gg.rsmod.plugins.content.areas.edgeville.objs

val OPEN_SFX = 53
val CLOSE_SFX = 54

on_obj_option(obj = Objs.COFFIN_398, option = "open") {
    open(player, getInteractingGameObj())
}

on_obj_option(obj = Objs.COFFIN_3577, option = "close") {
    close(player, getInteractingGameObj())
}

fun open(p: Player, obj: GameObject) {
    p.playSound(OPEN_SFX)
    p.message("The coffin creaks open...")
    p.world.spawn(DynamicObject(obj, Objs.COFFIN_3577))
}

fun close(p: Player, obj: GameObject) {
    p.playSound(CLOSE_SFX)
    p.message("You close the coffin.")
    p.world.spawn(DynamicObject(obj, Objs.COFFIN_398))
}