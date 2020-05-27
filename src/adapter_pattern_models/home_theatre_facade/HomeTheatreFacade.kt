package adapter_pattern_models.home_theatre_facade

class HomeTheatreFacade(
    var amp:Amplifier,
    var popcornPopper: PopcornPopper,
    var screen: Screen,
    var theatreLights: TheatreLights,
    var projector: Projector
) {
    fun watchMovie():String {
        popcornPopper.on()
        theatreLights.dim()
        screen.down()
        projector.on()
        amp.dvd.on()
        amp.dvd.play()
        amp.tuner.on()
        return "Playing ${amp.dvd.dvd}"
    }

    fun endMovie() {
        popcornPopper.off()
        theatreLights.off()
        screen.up()
        projector.on()
        amp.dvd.eject()
        amp.dvd.off()
        amp.tuner.on()
        amp.tuner.off()
    }
}