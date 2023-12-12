package com.example.android_tv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MovieList {
    private static long count = 0;
    public static final String MOVIE_CATEGORY[] = {
            "Software Seguro",
            "Novedades\nTecnológicas",
            "Herramientas\nTecnologías",
            "Experiencias\nPersonales",
            "Inteligencia Artificial"
    };

    private static Map<String, List<Movie>> categoryMovieMap;

    public static List<Movie> getList(int categoryIndex) {
        if (categoryMovieMap == null) {
            categoryMovieMap = setupMovies();
        }

        String category = getCategoryKey(categoryIndex);

        if (categoryMovieMap.containsKey(category)) {
            return categoryMovieMap.get(category);
        } else {
            return new ArrayList<>();
        }
    }

    private static Map<String, List<Movie>> setupMovies() {
        Map<String, List<Movie>> map = new HashMap<>();

        for (int i = 0; i < MOVIE_CATEGORY.length; i++) {
            map.put(getCategoryKey(i), createMoviesForCategory(i));
        }

        return map;
    }

    private static Movie buildMovieInfo(String title, String description, String studio, String videoUrl, String cardImageUrl, String backgroundImageUrl, int categoryIndex) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        movie.setCategoryIndex(categoryIndex);
        return movie;
    }
    private static List<Movie> createMoviesForCategory(int categoryIndex) {
        List<Movie> list = new ArrayList<>();

        // Agregar películas según la categoría
        switch (categoryIndex) {
            case 0: //"Desarrollo Seguro"
                list.add(buildMovieInfo(
                        "Cómo Ejecutar un Software Antivirus en modo Seguro en mi PC",
                        "En este video te mostramos Cómo Ejecutar un Software Antivirus en modo Seguro en tu PC. En este canal encontrarás los mejores tutoriales. ¡No te lo pierdas!",
                        "Mira Cómo Se Hace",
                        "https://www.youtube.com/watch?v=EZpJwP5Zd-I",
                        "https://img.youtube.com/vi/EZpJwP5Zd-I/maxresdefault.jpg",
                        "https://overflow.pe/wp-content/uploads/2021/06/seguridad-en-internet.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Curso de desarrollo seguro de aplicaciones",
                        "En este enlace tienes gratis las 16 clases de este curso introductorio (6 clases adicionales a las que encontrarás en esta lista de videos) y además, al final del curso introducctorio gratuito encontrarás un mega descuento para que puedas seguir con el curso completo que cuenta con aproximadamente 140 clases",
                        "KeepCoding - Tech School",
                        "https://www.youtube.com/watch?v=ERy_XSZLpuQ&list=PLQpe1zyko1pil9wxOQAw1nvRg42H7RrQZ&index=2",
                        "https://img.youtube.com/vi/slUjcnfq470/maxresdefault.jpg",
                        "https://overflow.pe/wp-content/uploads/2021/06/seguridad-en-internet.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "La seguridad en el desarrollo de productos",
                        "En esta segunda charla del ciclo “Desarrollo de Software”, Alejandro F. Masino realiza un abordaje de los distintos aspectos de la seguridad de la información, haciendo hincapié en las actividades a realizar como parte integral del desarrollo de productos y aplicaciones. \n" +
                                "En el desarrollo del encuentro, Alejandro realiza una enumeración de mejores prácticas, como así también, las tareas que involucran las distintas etapas del ciclo de vida del software y referencia a estándares a considerar.",
                        "Facultad de Ingeniería - UNER",
                        "https://www.youtube.com/watch?v=meYBX0EY7DU",
                        "https://img.youtube.com/vi/meYBX0EY7DU/maxresdefault.jpg",
                        "https://overflow.pe/wp-content/uploads/2021/06/seguridad-en-internet.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Seguridad en el Ciclo de Vida del Desarrollo de Software",
                        "Seguridad en el Ciclo de Vida del Desarrollo de Software." +
                                "Participación Inicial del Foro 2. del Curso Programación Avanzada en Web." +
                                "UNED Costa Rica IC-2019",
                        "Roy Marquez",
                        "https://www.youtube.com/watch?v=Pf3eTy7u9qU",
                        "https://img.youtube.com/vi/Pf3eTy7u9qU/maxresdefault.jpg",
                        "https://overflow.pe/wp-content/uploads/2021/06/seguridad-en-internet.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "DESARROLLO DE SOFThttps://www.youtube.comWARE SEGURO. JOSSIMAR MIRANDA",
                        "DESARROLLO DE SOFTWARE SEGURO. JOSSIMAR MIRANDA",
                        "Jossimar Miranda",
                        "/watch?v=OYzU-xiVOVA",
                        "https://img.youtube.com/vi/OYzU-xiVOVA/sddefault.jpg",
                        "https://overflow.pe/wp-content/uploads/2021/06/seguridad-en-internet.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "OWASP Desarrollo Seguro de Software 2021",
                        "Todo lo básico que debemos saber para iniciar con desarrollo seguro de software, desde prácticas hasta menciones a estándares, proyectos y herramientas que podemos utilizar.\n" +
                                "Por Mario Robles, líder del capítulo de OWASP Costa Rica junto con Cristian Herrera y CEO de WhiteJaguars Cyber Security",
                        "OWASP San Jose, Costa Rica",
                        "https://www.youtube.com/watch?v=oXJTx_J4mIY",
                        "https://img.youtube.com/vi/oXJTx_J4mIY/maxresdefault.jpg",
                        "https://overflow.pe/wp-content/uploads/2021/06/seguridad-en-internet.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Desarrollo de Software seguro",
                        "El proceso de desarrollo de software moderno es más que nunca, un esfuerzo de equipo. La seguridad y el desarrollo deben trabajar juntos para garantizar la salud de su código y reducir el riesgo de fallas peligrosas una vez que se implementa el software.",
                        "Ren",
                        "https://www.youtube.com/watch?v=1Ukndr3wQu8&ab_channel=Ren",
                        "https://img.youtube.com/vi/1Ukndr3wQu8/maxresdefault.jpg",
                        "https://overflow.pe/wp-content/uploads/2021/06/seguridad-en-internet.jpg",
                        categoryIndex));
                break;
            case 1: //"Nuevas Tecnológicas"
                list.add(buildMovieInfo(
                        "Top 10 Tendencias Tecnológicas 2023 - La Tecnología Del Futuro",
                        "Top 10 Tendencias Tecnológicas 2023: ¡Prepárate para conocer las innovaciones más emocionantes de este año! En nuestro video, te mostraremos las tendencias en inteligencia artificial, realidad virtual, ciberseguridad y mucho más. En inteligencia artificial, veremos cómo la automatización de aprendizaje profundo y el aprendizaje automático están cambiando la forma en que las empresas manejan sus datos. La realidad virtual y aumentada se están convirtiendo en una herramienta valiosa para la educación y el entretenimiento.",
                        "Omar Castaneda",
                        "https://fb.watch/oQEP0dALF1/",
                        "https://img.youtube.com/vi/iYTLYUILcYI/maxresdefault.jpg",
                        "https://www.computerworld.es/archivos/202209/1540525718623.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Cómo el cómputo cuántico rompe el internet, desde ahora.",
                        "Una computadora cuántica en la próxima década podría descifrar el cifrado en el que se basa nuestra sociedad utilizando el algoritmo de Shor.",
                        "Veritasium en español",
                        "https://youtu.be/xymGpIeNc88",
                        "https://img.youtube.com/vi/xymGpIeNc88/maxresdefault.jpg",
                        "https://www.computerworld.es/archivos/202209/1540525718623.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Qué es el metaverso y cuáles son las dudas que genera este mundo “gemelo” digital | BBC Mundo",
                        "Los grandes de la tecnología prometen que el metaverso significará una revolución digital que comparan a la que ocurrió cuando cambiamos los teléfonos celulares por los smartphones. Microsoft lo describe como un mundo digital habitado por gemelos digitales de personas, lugares y cosas.",
                        "BBC News Mundo",
                        "https://youtu.be/XIJwITC2DeU",
                        "https://img.youtube.com/vi/XIJwITC2DeU/maxresdefault.jpg",
                        "https://www.computerworld.es/archivos/202209/1540525718623.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "¿Cómo funciona el CLOUD GAMING y por qué no tiene éxito?",
                        "Ahorra un 15% en tu compra de Carly con el código (NATE)  (aplicado automáticamente) hasta el 30 de noviembre 2023",
                        "Nate Gentile",
                        "https://youtu.be/Inf44ntVMp0",
                        "https://img.youtube.com/vi/Inf44ntVMp0/maxresdefault.jpg",
                        "https://www.computerworld.es/archivos/202209/1540525718623.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "El poder de la Bioinformática: el genoma entero en tu portátil - Ivan Ellson",
                        "La bioinformática está en auge en estos últimos años. Se puede aplicar a todas las disciplinas científicas, desde genómica hasta ecología y su utilidad es abrumadora. Si eres estudiante y te gusta la ciencia, te interesará saber cómo te puedes acercar a la bioinformática desde el punto de vista de un biólogo. Aquí te cuento mi experiencia y mi línea de investigación actual, donde aplico técnicas bioinformáticas para estudiar la Leucemia Mieloide Aguda pediátrica.",
                        "Fundación Descubre",
                        "https://youtu.be/PKs1c9rHvzE",
                        "https://img.youtube.com/vi/PKs1c9rHvzE/maxresdefault.jpg",
                        "https://www.computerworld.es/archivos/202209/1540525718623.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "¿Qué es la Realidad Extendida y dónde puedes probarla?",
                        "La Realidad Extendida ha llegado para imponerse a otros conceptos como la Realidad Virtual, la Realidad Aumentada o la Realidad Mixta. Son conceptos que hemos visto en Ready Player One. Además de ofreceros nuestra crítica de esta película tan pronto como nos ha sido posible, hemos querido indagar un poco más en profundidad acerca de la tecnología que se muestra en ella, basada en la novela de Ernest Cline.",
                        "Hobby Consolas",
                        "https://youtu.be/_go7DinWXAo",
                        "https://img.youtube.com/vi/_go7DinWXAo/maxresdefault.jpg",
                        "https://www.computerworld.es/archivos/202209/1540525718623.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Grand Theft Auto VI Trailer 1",
                        "Song: Love Is A Long Road Artist: Tom Petty Written by Thomas Earl Petty and Michael W. Campbell Published by Universal Music Works on behalf of Wild Gator Music (GMR) and Wixen Music Publishing, Inc. as agent for Gone Gator Music (ASCAP) and NotoriousJBPSongs (ASCAP) Courtesy of Universal Music Enterprises, a Division of UMG Recordings, Inc.",
                "Rockstar Games",
                        "https://www.youtube.com/watch?v=QdBZY2fkU-0&ab_channel=RockstarGames",
                        "https://img.youtube.com/vi/QdBZY2fkU-0/maxresdefault.jpg",
                        "https://www.computerworld.es/archivos/202209/1540525718623.jpg",
                        categoryIndex));
                break;
            case 2: //Herramientas Tecnologías
                list.add(buildMovieInfo(
                        "Mis Herramientas Favoritas de Desarrollo",
                        "Este video es una lista de algunas de mis herramientas y servicios favoritos de desarrollo en general, tanto desarrollo de aplicaciones web, desarrollo de aplicaciones moviles, y desarrollo backend, frontend entre los que podemos encontra editores de codigo, frameworks, lenguajes de programación, servicios cloud, entre muchos otros.",
                        "Fazt",
                        "https://www.youtube.com/watch?v=0me15LyLGO8&ab_channel=Fazt",
                        "https://img.youtube.com/vi/0me15LyLGO8/maxresdefault.jpg",
                        "https://www.teknei.com/wp-content/uploads/2021/11/v617batch2-kul-25-technology.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "▶ 7 herramientas DIGITALES \uD83D\uDDA5 para tus clases VIRTUALES\uD83D\uDCBB\uD83D\uDCF7 /HÍBRIDAS",
                        "En este video te comparto y te explico como utilizar 7 herramientas DIGITALES para tus clases VIRTUALES.",
                        "Aula De Medios - Tecnología Para Maestros",
                        "https://www.youtube.com/watch?v=T0Iqal44CbM&ab_channel=AulaDeMedios-Tecnolog%C3%ADaParaMaestros",
                        "https://img.youtube.com/vi/T0Iqal44CbM/maxresdefault.jpg",
                        "https://www.teknei.com/wp-content/uploads/2021/11/v617batch2-kul-25-technology.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "LAS 6 NUEVAS TECNOLOGÍAS del FUTURO que CAMBIARÁN EL MUNDO en 5 AÑOS (TE VAN A SORPRENDER)",
                        "✨ ¡Descubre las TECNOLOGÍAS DEL FUTURO que están a punto de transformar nuestro mundo! En este video, exploramos las 10 innovaciones más emocionantes que cambiarán todo, desde cómo trabajamos hasta cómo vivimos. ¡Prepárate para un viaje al futuro!",
                        "SAEID",
                        "https://www.youtube.com/watch?v=O5FruMtoaGI&ab_channel=SAEID",
                        "https://img.youtube.com/vi/O5FruMtoaGI/maxresdefault.jpg",
                        "https://www.teknei.com/wp-content/uploads/2021/11/v617batch2-kul-25-technology.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Herramientas ESENCIALES para todo Desarrollador",
                        "A través de toda mi carrera profesional, he cambiado varias veces las herramientas que uso para la ejecución de mis actividades de desarrollo y administración de equipos de ingeniería. Hoy, he encontrado el conjunto de aplicaciones ideales y gratuitas, esenciales para los desarrolladores de software y estudiantes que quieran iniciar en la industria.",
                        "Ricardo Santos",
                        "https://www.youtube.com/watch?v=1f779-SuCnY&ab_channel=RicardoSantos",
                        "https://img.youtube.com/vi/1f779-SuCnY/maxresdefault.jpg",
                        "https://www.teknei.com/wp-content/uploads/2021/11/v617batch2-kul-25-technology.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "7 herramientas que se utilizan en el desarrollo de software",
                        "En este video vamos a ver 7 herramientas que se utilizan en el proceso de desarrollo de software. Utilizas todas estas?",
                        "HolaMundo",
                        "https://www.youtube.com/watch?v=yjnxqk2crNA&ab_channel=HolaMundo",
                        "https://img.youtube.com/vi/yjnxqk2crNA/maxresdefault.jpg",
                        "https://www.teknei.com/wp-content/uploads/2021/11/v617batch2-kul-25-technology.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "HERRAMIENTAS DIGITALES vs HERRAMIENTAS TECNOLÓGICAS",
                        "HERRAMIENTAS DIGITALES vs HERRAMIENTAS TECNOLÓGICAS",
                        "tahedi",
                        "https://www.youtube.com/watch?v=eSFzi-uFZno&ab_channel=tahedi",
                        "https://img.youtube.com/vi/eSFzi-uFZno/maxresdefault.jpg",
                        "https://www.teknei.com/wp-content/uploads/2021/11/v617batch2-kul-25-technology.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "HERRAMIENTAS TECNOLÓGICAS PARA ENTORNOS EDUCATIVOS",
                        "Este video hace parte de Complementaria Atención al cliente por medios tecnológicos",
                        "Ecosistema de Recursos Educativos Digitales SENA",
                        "https://www.youtube.com/watch?v=DxXXccau3C8&ab_channel=EcosistemadeRecursosEducativosDigitalesSENA",
                        "https://img.youtube.com/vi/DxXXccau3C8/maxresdefault.jpg",
                        "https://www.teknei.com/wp-content/uploads/2021/11/v617batch2-kul-25-technology.jpg",
                        categoryIndex));
                break;
            case 3: //"Experiencias Personales"
                list.add(buildMovieInfo(
                        "CÓMO EVITAR LOS ERRORES DURANTE UNA ENTREVISTA DE TRABAJO \uD83D\uDE32",
                        "Cómo evitar los errores durante una entrevista de trabajo. En este vídeo se muestra cómo evitar los errores más comunes en una entrevista de trabajo. Conseguir un empleo depende en gran medida de cómo te presentas durante la entrevista, para ello debes evitar errores en una entrevista. Existen errores comunes en una entrevista de trabajo, por lo tanto, no es suficiente tu formación académica, tus conocimientos técnicos o tu experiencia, también tiene una gran importancia tu actitud, el lenguaje corporal, y la forma de enfocar la entrevista en su conjunto. Para lograr una buena impresión en una entrevista de trabajo, es importante saber cómo no cometer muchos errores, es decir, eliminar los errores más frecuentes en la entrevista. Durante la entrevista de trabajo debes estar muy atento y recordar cómo evitar los errores mencionados en este vídeo.",
                        "Jorge Cogollo",
                        "https://www.youtube.com/watch?v=wM3WOCiJFtg&ab_channel=JorgeCogollo",
                        "https://img.youtube.com/vi/wM3WOCiJFtg/maxresdefault.jpg",
                        "https://www.certus.edu.pe/blog/wp-content/uploads/2021/10/descubre-proceso-desarrollo-software-1160x630.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "MI PRIMERA EXPERIENCIA COMO DESARROLLADOR DE SOFTWARE",
                        "Buenas gente!! como estan? espero que bien, se que fue un poco largo el vídeo pero es uno de los vídeos que mas me gusto hacer realmente. Espero que lo hayan disfrutado como yo lo disfrute y que les sirva como experiencia para aplicar a futuro. GRACIAS Y MÁS GRACIAS a todos ustedes que me estan escribiendo, comentando, haciendo el aguante, siguiendome en instagram. Lo valoro muchisimo no puedo creer que ya estamos encaminando los 1600 suscriptores. LOS AMO FUERTE!",
                        "Toto Ruffa",
                        "https://www.youtube.com/watch?v=SB2XI9N8IkI&ab_channel=TotoRuffa",
                        "https://img.youtube.com/vi/SB2XI9N8IkI/maxresdefault.jpg",
                        "https://www.certus.edu.pe/blog/wp-content/uploads/2021/10/descubre-proceso-desarrollo-software-1160x630.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Como TRABAJAR sin Experiencia ⚡ Encontrar el primer trabajo",
                        "Como trabajar sin experiencia es una pregunta que todos nos hemos hecho cuando comenzamos nuestras carreras profesionales. Si estás buscando empleo y no tienes experiencia laboral, no te preocupes. Estás en el sitio correcto!!!",
                        "yomempleo",
                        "https://www.youtube.com/watch?v=q_2R6XRaGHo&ab_channel=yomempleo",
                        "https://img.youtube.com/vi/q_2R6XRaGHo/maxresdefault.jpg",
                        "https://www.certus.edu.pe/blog/wp-content/uploads/2021/10/descubre-proceso-desarrollo-software-1160x630.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Programar es DIFÍCIL... (8 verdades duras)",
                        "Te comparto 8 verdades de por qué programar es difícil. También algunas recomendaciones y experiencias para que superes estas dificultades (especialmente si estás aprendiendo a programar). \uD83D\uDCAA",
                        "Programador X",
                        "https://www.youtube.com/watch?v=mjVhZaDi80M&ab_channel=ProgramadorX",
                        "https://img.youtube.com/vi/mjVhZaDi80M/maxresdefault.jpg",
                        "https://www.certus.edu.pe/blog/wp-content/uploads/2021/10/descubre-proceso-desarrollo-software-1160x630.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Como fue mi primera experiencia laboral como developer Frontend | 18 años",
                        "Bienvenidos Devs!, hoy te comentare como fue mi primera experiencia laboral como desarrollador, como lo conseguí y todo lo demás, De verdad es un buen vídeo muy intuitivo y espero les ayude muchísimo.\n" +"\n" + "siempre es bueno saber como fue la experiencia de otros, así que si llegaste a leer esto comenta:\n" + "\"Que crack\" ;)",
                        "Denilson",
                        "https://www.youtube.com/watch?v=CLZtL0NDBcw&ab_channel=Denilson",
                        "https://img.youtube.com/vi/CLZtL0NDBcw/maxresdefault.jpg",
                        "https://www.certus.edu.pe/blog/wp-content/uploads/2021/10/descubre-proceso-desarrollo-software-1160x630.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Que hace un programador junior sin experiencia en su primer empleo y primeros meses | Luisito Habla",
                        "Programador junior sin experiencia? te has preguntado que puede hacer un programador junior en su primer empleo? la verdad es que pueden ser muchas las areas en las que puedes empesar a trabajar, en este video te dejo un opinion muy personal referente al tema la cual espero sea de mucha ayuda.",
                        "Luisito Habla",
                        "https://www.youtube.com/watch?v=7QM4EiTDWBI&ab_channel=LuisitoHabla",
                        "https://img.youtube.com/vi/7QM4EiTDWBI/maxresdefault.jpg",
                        "https://www.certus.edu.pe/blog/wp-content/uploads/2021/10/descubre-proceso-desarrollo-software-1160x630.jpg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "TRABAJAR COMO PROGRAMADOR CON el lenguaje JAVA",
                        "En este video te contare como es mi experiencia trabajando como programador o desarrollador #java con #springboot \n" + "- Que hace un programador java\n" + "- Como es el trabajo de un java developer",
                        "Yo Androide",
                        "https://www.youtube.com/watch?v=R8VgkU8By0c&ab_channel=YoAndroide",
                        "https://img.youtube.com/vi/R8VgkU8By0c/maxresdefault.jpg",
                        "https://www.certus.edu.pe/blog/wp-content/uploads/2021/10/descubre-proceso-desarrollo-software-1160x630.jpg",
                        categoryIndex));
                break;
            case 4: //"Inteligencia artificial"
                list.add(buildMovieInfo(
                        "¿Qué es la inteligencia artificial?",
                        "Desde el Siri de Apple hasta el control del tráfico aéreo. La inteligencia artificial (I.A.) es uno de los temas tecnológicos de alcance global más polémicos. Algunos dicen que salvará la Humanidad y que incluso que nos hará inmortales. Otros afirman que nos destruirá. Te explicamos exactamente qué es la I.A. y cuáles son sus alcances.",
                        "BBC News Mundo",
                        "https://www.youtube.com/watch?v=8lMIdrlIWOQ",
                        "https://img.youtube.com/vi/8lMIdrlIWOQ/maxresdefault.jpg",
                        "https://www.manutan.es/blog/wp-content/uploads/2022/03/BUY2110022PIC1.jpeg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Inteligencia Artificial, Te Falta Calle | Casi Creativo",
                        "¿Todavía le falta calle a la inteligencia artificial o ya tendríamos que empezar a preocuparnos? Cerebrito hace un esfuerzo por enseñarle lo mejor de ser humano, pero la IA se resiste.",
                        "Fred Lammie",
                        "https://www.youtube.com/watch?v=gYGi9iDbHtM",
                        "https://img.youtube.com/vi/gYGi9iDbHtM/maxresdefault.jpg",
                        "https://www.manutan.es/blog/wp-content/uploads/2022/03/BUY2110022PIC1.jpeg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Padre de la Inteligencia Artificial renuncia y advierte amenaza para la humanidad",
                        "Padre de la Inteligencia Artificial renuncia y advierte amenaza para la humanidad",
                        "Tu COSMOPOLIS",
                        "https://www.youtube.com/watch?v=rbQsUDOxMaU",
                        "https://img.youtube.com/vi/rbQsUDOxMaU/maxresdefault.jpg",
                        "https://www.manutan.es/blog/wp-content/uploads/2022/03/BUY2110022PIC1.jpeg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "El robot humanoide Sofía, único en el mundo, llega al plató - El Hormiguero 3.0",
                        "Con Marron hemos conocido a la robot humanoide Sofía, única en el mundo. Es el futuro y lo hemos podido ver en 'El Hormiguero 3.0': es el robot más avanzado en tecnología artificial del mundo y está diseñado para que pueda aprender de nosotros y de nuestra personalidad para mezclarse con los humanos. Pablo Motos ha asegurado que asusta un poco. ¡Conócela!",
                        "Antena 3",
                        "https://www.youtube.com/watch?v=cmwDygh3xGY",
                        "https://img.youtube.com/vi/cmwDygh3xGY/maxresdefault.jpg",
                        "https://www.manutan.es/blog/wp-content/uploads/2022/03/BUY2110022PIC1.jpeg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "OpenAI: un nuevo avance en inteligencia artificial | El superavión de DARPA | Noticias de tecnología",
                        "El escándalo en torno a OpenAI y Sam Altman sigue dando que hablar. Un reciente informe de Reuters, que cita información privilegiada, ha dado un nuevo giro a la historia. Al parecer, varios investigadores de OpenAI han escrito una carta al consejo de administración en la que expresan su preocupación por un descubrimiento pionero en el campo de la IA que, en su opinión, podría suponer una amenaza para la humanidad.",
                        "PRO ROBOTS - Robots, IA y tecnologías del futuro",
                        "https://www.youtube.com/watch?v=frrKyNRY3JY",
                        "https://img.youtube.com/vi/frrKyNRY3JY/maxresdefault.jpg",
                        "https://www.manutan.es/blog/wp-content/uploads/2022/03/BUY2110022PIC1.jpeg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "Inteligencia artificial, respondió a insultos de Bad Bunny y advierte con lanzar nueva canción",
                        "El cantante puertorriqueño se molestó con sus seguidores por difundir la canción creada con IA.",
                        "MILENIO",
                        "https://www.youtube.com/watch?v=CqJjdFB91d4",
                        "https://img.youtube.com/vi/CqJjdFB91d4/maxresdefault.jpg",
                        "https://www.manutan.es/blog/wp-content/uploads/2022/03/BUY2110022PIC1.jpeg",
                        categoryIndex));
                list.add(buildMovieInfo(
                        "China revoluciona la educación con Inteligencia Artificial",
                        "Un número cada vez mayor de aulas en China están equipadas con cámaras de inteligencia artificial y rastreadores de ondas cerebrales. Si bien muchos padres y maestros los ven como herramientas para mejorar las calificaciones, se han convertido en la peor pesadilla de algunos niños. Enterate por qué",
                        "Pato Bonato",
                        "https://www.youtube.com/watch?v=JmQWoeNwaFQ",
                        "https://img.youtube.com/vi/JmQWoeNwaFQ/maxresdefault.jpg",
                        "https://www.manutan.es/blog/wp-content/uploads/2022/03/BUY2110022PIC1.jpeg",
                         categoryIndex));
                break;
        }
        return list;
    }

    private static String getCategoryKey(int categoryIndex) {
        return String.valueOf(categoryIndex);
    }
}