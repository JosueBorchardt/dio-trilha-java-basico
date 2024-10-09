classDiagram
    class MusicPlayer {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class Phone {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class WebBrowser {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone ..|> MusicPlayer
    iPhone ..|> Phone
    iPhone ..|> WebBrowser
