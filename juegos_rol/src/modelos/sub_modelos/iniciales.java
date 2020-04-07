/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.sub_modelos;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author donpe
 */
public class iniciales {

    public static ArrayList<nat_con> naturalezas_conducta_V20() {
        ArrayList<nat_con> Nat_Con = new ArrayList<>();
        Nat_Con.add(new nat_con("Ansioso de Emociones", ""));
        Nat_Con.add(new nat_con("Arqiotecto", ""));
        Nat_Con.add(new nat_con("Bravucón", ""));
        Nat_Con.add(new nat_con("Bellaco", ""));
        Nat_Con.add(new nat_con("Camaleón", ""));
        Nat_Con.add(new nat_con("Capitalista", ""));
        Nat_Con.add(new nat_con("Celebrante", ""));
        Nat_Con.add(new nat_con("Científico", ""));
        Nat_Con.add(new nat_con("Competidor", ""));
        Nat_Con.add(new nat_con("Confabulador", ""));

        Nat_Con.add(new nat_con("Conformista", ""));
        Nat_Con.add(new nat_con("Depravado", ""));
        Nat_Con.add(new nat_con("Diletante", ""));
        Nat_Con.add(new nat_con("Director", ""));
        Nat_Con.add(new nat_con("Enigma", ""));
        Nat_Con.add(new nat_con("Fanatico", ""));
        Nat_Con.add(new nat_con("Gallardo", ""));
        Nat_Con.add(new nat_con("Guru", ""));
        Nat_Con.add(new nat_con("Hedonista", ""));
        Nat_Con.add(new nat_con("Hosco", ""));

        Nat_Con.add(new nat_con("Idealista", ""));
        Nat_Con.add(new nat_con("Juez", ""));
        Nat_Con.add(new nat_con("Masoquista", ""));
        Nat_Con.add(new nat_con("Martir", ""));
        Nat_Con.add(new nat_con("Monstruo", ""));
        Nat_Con.add(new nat_con("Niño", ""));
        Nat_Con.add(new nat_con("Ojo de laTormenta", ""));
        Nat_Con.add(new nat_con("Pedagogo", ""));
        Nat_Con.add(new nat_con("Penitente", ""));
        Nat_Con.add(new nat_con("Perfeccionista", ""));

        Nat_Con.add(new nat_con("Protector", ""));
        Nat_Con.add(new nat_con("Rebelde", ""));
        Nat_Con.add(new nat_con("Repulsivo", ""));
        Nat_Con.add(new nat_con("Sádico", ""));
        Nat_Con.add(new nat_con("Sociópata", ""));
        Nat_Con.add(new nat_con("Superviviente", ""));
        Nat_Con.add(new nat_con("Tradicionalista", ""));
        Nat_Con.add(new nat_con("truhan", ""));
        Nat_Con.add(new nat_con("Visionario", ""));

        return Nat_Con;
    }

    public static ArrayList<Clan> clanes_v20() {
        ArrayList<Clan> clanes = new ArrayList<>();
        Clan Assamitas = new Clan();
        Clan Brujah = new Clan();
        Clan Gangrel = new Clan();
        Clan Giovanni = new Clan();
        Clan Lasombra = new Clan();
        Clan Malkavian = new Clan();
        Clan Nosferatu = new Clan();
        Clan Ravnos = new Clan();
        Clan Seguidores_de_Set = new Clan();
        Clan Toreador = new Clan();
        Clan Tremere = new Clan();
        Clan Tzimisce = new Clan();
        Clan Ventrue = new Clan();
        Clan Caitiff = new Clan();

        Assamitas.setNombre("Assamitas");
        Assamitas.setDescripcion("Los Chiquillos de Haqim, conocidos como Assamitas"
                + "por el resto de los Vástagos, son un cuchillo silencioso en"
                + "la oscuridad, una orden de ejecutores sedientos de Sangre"
                + "que participa en las guerras secretas de los no-muertos"
                + "actuando como asesinos a sueldo. Fuera del alcance de "
                + "las Sectas, los Assamitas son auténticos Independientes "
                + "y mercenarios, ofreciendo sus servicios a quienquiera que "
                + "pague su precio en Sangre, al margen de la ley del Príncipe o del Priscus. Para cuando su objetivo se da cuenta de "
                + "que un Assamita lo está acechando, suele ser demasiado "
                + "tarde. Huelga decir que los Asesinos son temidos y denostados por muchos otros Clanes.\n"
                + "En realidad, los Assamitas son mucho más que unos "
                + "simples matones y asesinos. El suyo es un Clan complejo pero aislado, basado en tres principios: la sabiduría, la "
                + "hechicería y la Diablerie. Sin embargo, la mayoría de los "
                + "Assamitas con los que se encuentran otros vampiros son "
                + "miembros de la casta guerrera, así que la sociedad de los "
                + "Vástagos los ve de esa manera. Por su parte, los Asesinos "
                + "no han hecho nada para desmentir este malentendido. Si "
                + "los ayuda a conseguir más contratos y oculta la verdadera "
                + "naturaleza de su Clan, mejor para ellos.\n"
                + "Hace mucho, los Assamitas fueron sometidos por medio de una poderosa maldición, conjurada por los Tremere bajo las órdenes de la Camarilla, que puso freno "
                + "a su sed de Sangre. No pueden probar la Vitae de otro "
                + "vampiro sin que esto les cause daño. En su constante búsqueda para reducir su Generación y acercarse a su sagrada "
                + "figura, Haqim (quien algunos eruditos de fuera del Clan "
                + "afirman que pertenecía a la Segunda Generación, mientras que otros insisten en que fue un juez designado por "
                + "los otros Antediluvianos), los Assamitas han de refinar la "
                + "Sangre de Vástago en una solución alquímica. Si no fuera "
                + "por este yugo místico, seguramente estarían inmersos en "
                + "una impía cruzada de Diablerie sin control.");
        Assamitas.setApodo("Asesinos");
        Assamitas.setSecta("independientes");
        Assamitas.setSecta_des("Para casi todo, los Assamitas tienden a ser Independientes, dejando que las Sectas los contraten para "
                + "operar en sus propios términos. Dicho esto, algunos Assamitas creen que una alianza con la Camarilla o el Sabbat "
                + "podría permitir que el Clan se mantuviera más fuerte.");
        Assamitas.setApariencia("Los Assamitas más viejos suelen provenir "
                + "de culturas de Oriente Medio o del Norte de África, aunque cada vez es más habitual que los jóvenes Assamitas "
                + "provengan de orígenes más diversos. En sus ambientes "
                + "tradicionales, los Assamitas prefieren vestirse conforme "
                + "a las costumbres religiosas o del Clan. Cuando están en público, sin embargo, "
                + "los Assamitas visten igual "
                + "que los oriundos del "
                + "lugar, lo que les permite cumplir sus contratos sin que nadie "
                + "note nada extraño. "
                + "La piel de un Assamita se oscurece con "
                + "la edad (al contrario "
                + "que la de los otros "
                + "vampiros, cuya piel "
                + "se hace más pálida); los Assamitas particularmente antiguos tienen un "
                + "tono de piel similar al ébano.");
        Assamitas.setRefugio("Los Assamitas suelen compartir refugios comunales con otros miembros de su célula local, estructuras remotas que les permiten vigilar los dominios más "
                + "grandes desde la distancia. Estos refugios normalmente "
                + "están bien equipados, pero no son tan lujosos como para "
                + "no poder trasladarse al completo en poco tiempo. Algunos Assamitas también tienden a mantener guaridas personales de naturaleza mucho más humilde para cuando "
                + "necesiten un lugar en el que no llamar la atención");
        Assamitas.setTrasfondo("Aquéllos Abrazados por el Clan Assamita "
                + "tienden a caer en dos tipos diferenciados: los miembros "
                + "“provinciales” del Clan encajan en su lugar de origen sea "
                + "cual sea y pueden mezclarse sin problemas con la gente que los rodea; los de clase alta trascienden culturas, "
                + "respaldados por su habilidad para hacer frente a desafíos "
                + "interpersonales e intelectuales.");
        Assamitas.setCreacion(" Los Atributos Físicos tienden a "
                + "ser los primarios, aunque algunos Assamitas prefieren los "
                + "Atributos Sociales para que los ayuden a acercarse a su presa. Prefieren por igual los Talentos y Técnicas, pero los Conocimientos pueden ser de ayuda para un Assamita si fuese "
                + "necesario. Pocos Asesinos cultivan grandes Trasfondos y, en "
                + "lugar de ello, se especializan en un abanico de Disciplinas "
                + "que aumentan su eficiencia. Los Assamitas más consumados "
                + "siguen la Senda de Iluminación propia de su Clan y aquéllos "
                + "que no lo hacen suelen tener que hacer grandes esfuerzos "
                + "para mantener sus Virtudes y Humanidad");
        Assamitas.setDebilidad("Debido a la Maldición de Sangre de los "
                + "Tremere, en caso de que un Assamita consuma la Sangre "
                + "de otro Vástago, sufrirá un nivel de daño letal automático no absorbible por cada punto que beba. Los intentos "
                + "de Diablerie resultan en daño agravado automático, un "
                + "nivel de Salud por cada punto de Fuerza de Voluntad permanente que posea su víctima; el Diabolista no ganará "
                + "ningún beneficio (incluyendo la reducción de Generación) si sobrevive al proceso. Además, el Assamita debe "
                + "ofrecer como diezmo una parte de los beneficios de sus "
                + "contratos a su Sire o a sus superiores (por lo general, un "
                + "diez por ciento de sus ganancias)");

        Assamitas.setOrganizacion("Una organización aislada y jerárquica "
                + "da forma a la mayoría de las costumbres de los Assamitas. "
                + "“El Viejo de la Montaña”, el maestro asesino que tiene su "
                + "refugio en la fortaleza del monte Alamut, es la autoridad "
                + "definitiva; el Clan obedece las órdenes que les transmite con una mezcla de reverencia y terror. Por norma, las cé"
                + "lulas individuales y locales de Assamitas, conocidas como"
                + "falaqi, tienen licencia para actuar con mayor autonomía,"
                + "aunque son raros los que traicionan la causa.");
        Assamitas.addDisciplina("Celeridad");
        Assamitas.addDisciplina("Extinción");
        Assamitas.addDisciplina("Ofuscación");
        Assamitas.setInsignia(new Image("media/insignias/Assamita.png"));
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------  
        Brujah.setNombre("Brujah");
        Gangrel.setNombre("Gangrel");
        Giovanni.setNombre("Giovanni");
        Lasombra.setNombre("Lasombra");
        Malkavian.setNombre("Malkavian");
        Nosferatu.setNombre("Nosferatu");
        Ravnos.setNombre("Ravnos");
        Seguidores_de_Set.setNombre("Seguidores de Set");
        Toreador.setNombre("Toreador");
        Tremere.setNombre("Tremere");
        Tzimisce.setNombre("Tzimisce");
        Ventrue.setNombre("Ventrue");
        Caitiff.setNombre("Caitiff");
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------
        Brujah.setDescripcion("El legado de los Brujah es uno de dorados tiempos pasados arruinados por sus fogosas naturalezas. Suya fue la gloria de la antigua Cartago, pero la traición de los Ventrue\n"
                + "de Roma acabó con el sueño. Desde entonces, los Brujah\n"
                + "les han guardado rencor.\n"
                + "En las noches actuales, los Brujah\n"
                + "son rebeldes y\n"
                + "provocadores,\n"
                + "pandilleros que\n"
                + "llevan bates y\n"
                + "agentes del cambio en una sociedad paralizada desde hace\n"
                + "mucho. Como rebeldes que son, está en su naturaleza desafiar el status quo... aunque, a veces, cuando no encuentran\n"
                + "oposición, ellos mismos personifican el status quo. Funciona bien, pues siempre hay un Brujah exaltado esperando\n"
                + "entre bastidores para derrocar a un compañero de Clan\n"
                + "al que se le han subido los humos y que está demasiado\n"
                + "cómodo en su papel de rebelde convertido en dictador.\n"
                + "Más que ningún otro Clan, los Brujah aún sienten las llamas\n"
                + "de las pasiones que los inspiraron siendo mortales. Aman las\n"
                + "causas y son rápidos en actuar ante discursos emotivos, acusaciones de injusticia o llamadas a las armas. Esta conexión\n"
                + "con las pasiones puede ser una bendición, pero la inspiración también puede llevar a la locura y el Ansia de la Bestia.\n"
                + "Ningún Príncipe sabio da la espalda a los Brujah. Es\n"
                + "raro que la Chusma permita que la manipulen o que la\n"
                + "adulen. Ante todo, un Brujah es su propio amo, y aquéllos\n"
                + "que quieran someterlo se enfrentan a una difícil tarea. Si\n"
                + "uno de ellos piensa que le están dando la pajita más\n"
                + "corta, hará trizas a sus enemigos primero y después,\n"
                + "quizás, recuerde hacer preguntas, sin importarle si\n"
                + "es un Primogénito o una autoridad mortal.\n"
                + "Algunos historiadores de los Vástagos afirman que\n"
                + "los Brujah se excusan en la antigua traición que sufrieron para adoptar el papel de agitadores contra el\n"
                + "mismo orden que ayudan a sostener. Otros aseguran\n"
                + "que los Brujah se han sometido a la voluntad de ese\n"
                + "mismo orden, siendo poco más que una oposición leal\n"
                + "sin poder alguno. A la mayoría de los Brujah les da lo\n"
                + "mismo mientras alguien necesite una buena patada\n"
                + "en el culo y puedan ser ellos quienes la den.");

        Brujah.setApodo("Chusma");
        Brujah.setSecta("camarilla");
        Brujah.setSecta_des(" Pese a toda su rebeldía, el\n"
                + "Clan Brujah normalmente se considera miembro de la Camarilla. A veces la Chusma\n"
                + "joven imita el salvajismo del Sabbat,\n"
                + "pero los Antiguos sostienen que\n"
                + "la Torre de Marfil les proporciona una estructura adecuada contra la\n"
                + "que enfocar su rabia");
        Brujah.setApariencia(" Muchos Brujah adoptan estilos y maneras que reflejan una actitud de rebelión. Pelo multicolor,\n"
                + "cabezas rapadas, clavos, tachuelas, prendas fetichistas y\n"
                + "camisetas con eslóganes insolentes pueden ser adecuados\n"
                + "para un Brujah. Aunque no todos llevan el “uniforme”:\n"
                + "la Chusma normalmente disfruta llevando atuendos que\n"
                + "buscan provocar. Algunos jóvenes Brujah prefieren dispositivos móviles como sus herramientas para la resistencia y\n"
                + "pueden convocar un altercado con sólo tocar una pantalla");
        Brujah.setRefugio(" Puede que los Brujah sientan afinidad por\n"
                + "una ciudad, pero raramente desarrollan estos lazos con\n"
                + "localizaciones específicas. Así, en cualquier momento,\n"
                + "un Brujah probablemente tendrá media docena o más de\n"
                + "escondites, refugios y pisos disponibles. Normalmente,\n"
                + "son viejos y están en malas condiciones hasta que el Brujah los necesita. Sus refugios pueden también albergar\n"
                + "mortales que sigan la ideología del vampiro o su culto\n"
                + "a la personalidad. Algo muy práctico: nunca viene mal\n"
                + "tener un recipiente a mano en caso de emergencia.");
        Brujah.setTrasfondo("Al ser criaturas pasionales, los Brujah a\n"
                + "menudo Abrazan sin pensárselo mucho, y sus Chiquillos\n"
                + "tienden a ser un grupo dispar. A veces, Abrazan a quienes comparten una visión o entusiasmo similar por la\n"
                + "misma causa que su futuro Sire. Otras veces, infligen el\n"
                + "Abrazo a aquéllos de ideología opuesta, maldiciendo al\n"
                + "rival con el vampirismo como castigo.");

        Brujah.setCreacion("Los Brujah normalmente (aunque no exclusivamente) provienen de mortales con personalidades violentas o rebeldes. Sus Naturalezas y Conductas\n"
                + "son a menudo similares, ya que los Brujah tienen poca paciencia para los engaños. Tienden hacia los Atributos Físicos, con los Sociales y Mentales bastante igualados. Muchos\n"
                + "prefieren las Técnicas y Talentos, pero la mayoría respeta\n"
                + "los Conocimientos que los hacen algo más que matones.\n"
                + "Contactos, Aliados y Rebaño son Trasfondos comunes.");
        Brujah.setDebilidad("Las mismas pasiones que inspiran a los\n"
                + "Brujah a la grandeza o la depravación, si se mantienen\n"
                + "sin restricciones, pueden llevarles a una rabia incandescente: las dificultades de las tiradas para resistir o guiar\n"
                + "el Frenesí (ver pág. 290) son dos puntos superiores a las\n"
                + "normales. Además, un Brujah nunca puede gastar Fuerza\n"
                + "de Voluntad para evitar el Frenesí, aunque puede gastar\n"
                + "un punto de Fuerza de Voluntad para intentar controlar\n"
                + "un Frenesí que ya haya comenzado");
        Brujah.setOrganizacion("Ciertas causas ascienden y caen entre la\n"
                + "élite Brujah, pero algunas de las más persistentes son las\n"
                + "llamadas Idealistas e Iconoclastas. Los Iconoclastas quieren\n"
                + "destruirlo todo, mientras que los Idealistas disfrutan resolviendo los problemas a través de la teoría. Esto evoca las raí-\n"
                + "ces clásicas de los Brujah como reyes filósofos, y los más Idealistas están entre las filas de los Brujah Ancillae y Antiguos.");
        Brujah.addDisciplina("Celeridad");
        Brujah.addDisciplina("Potencia");
        Brujah.addDisciplina("Presencia");
        Brujah.setInsignia(new Image("media/insignias/Brujah.png"));

        Gangrel.setDescripcion("Un destello de ojos rojos en la oscuridad, el olor almizcleño de un depredador, un brillo de colmillos, el sonido\n"
                + "de la carne al desgarrarse: éstas son las marcas de la presencia de los Gangrel. Más que ningún otro Clan, los Gangrel\n"
                + "se parecen a las bestias asociadas con las leyendas de vampiros: murciélagos, lobos y otras criatura de la noche. De\n"
                + "hecho, los Forasteros pueden desarrollar la habilidad de\n"
                + "transformarse en ésas y otras formas más primitivas.\n"
                + "Los Gangrel comparten también otras características\n"
                + "en común con los animales. Muchos rechazan los elaborados constructos sociales de la Estirpe y la Grey. Algunos prefieren moverse solos o en pequeñas manadas o\n"
                + "coteries. La mayoría son duros y, cuando los presionan,\n"
                + "feroces. Al sucumbir a las depredaciones de la Bestia, adquieren algunos rasgos que recuerdan al reino animal.\n"
                + "Como Clan, son precavidos y distantes. La mayoría preferiría pasar sus noches acechando presas o haciendo el\n"
                + "salvaje por azoteas antes que atendiendo a los edictos de\n"
                + "los Príncipes o presionando para que se les reconozca un\n"
                + "dominio. Mantienen una relación tensa con el resto de la\n"
                + "Estirpe y están entre quienes más frecuentemente se convierten en Anarquistas o Autarcas. En algunos lugares,\n"
                + "los Gangrel han abandonado colectivamente la pertenencia a cualquier Secta (en la medida que los\n"
                + "Gangrel hacen algo colectivamente).\n"
                + "La Jyhad parece menos pronunciada entre los\n"
                + "Gangrel que entre el resto de los Clanes y los\n"
                + "Forasteros tienen poco interés en el conflicto\n"
                + "eterno. Las diferencias entre los Gangrel a menudo son acerca de fronteras entre dominios y derechos de\n"
                + "Caza en lugar de desconfianza generacional, y las cosas\n"
                + "que preocupan a los jóvenes Forasteros son las mismas\n"
                + "que preocupan a los Ancillae e incluso a los Antiguos\n"
                + "Gangrel. Aun así, sería difícil considerar amigables\n"
                + "las relaciones entre generaciones diferentes,\n"
                + "excepto en situaciones en las que Sire y\n"
                + "Chiquillo estén aislados. La Bestia siempre sospecha de quienes puedan arrebatarle el sustento.");

        Gangrel.setApodo("Forasteros");
        Gangrel.setSecta("Camarilla");
        Gangrel.setSecta_des("Secta: Los Gangrel pertenecen, al menos nominalmente, a la Camarilla, pero siempre han tenido una facción muy ruidosa que rechaza la pertenencia a cualquier\n"
                + "Secta. Afirman que juegos políticos y estructuras sociales no aportan nada a su naturaleza primaria.");
        Gangrel.setApariencia("El propio aspecto no es una de las prioridades de la mayoría de los\n"
                + "Gangrel, cuya apariencia es, a menudo, más cuestión\n"
                + "de las circunstancias que de una\n"
                + "decisión. La Debilidad del Clan\n"
                + "puede modificarla\n"
                + "en gran medida,\n"
                + "tanto como una\n"
                + "larga no-vida\n"
                + "en los lugares que convierten en sus refugios, que suelen carecer de comodidades modernas.");
        Gangrel.setRefugio(" Habitualmente, los Gangrel se guarecen donde pueden ante la amenaza de la salida del Sol. Los que\n"
                + "tienen refugios permanentes normalmente tienden a lo\n"
                + "funcional: cualquier lugar desde una cueva a un callejón\n"
                + "puede servir de refugio a un Gangrel, sin tener apenas\n"
                + "signos que lo identifiquen como territorio personal (hasta que es demasiado tarde para el desafortunado intruso).");
        Gangrel.setTrasfondo("Los Gangrel Abrazan igual que buscan\n"
                + "presas: tras largas Cacerías en las que el futuro Chiquillo\n"
                + "ni siquiera sabe que lo están siguiendo. Crear un Retoño\n"
                + "significa compartir recursos limitados, así que cada relación entre Sire y Chiquillo es única y significativa. Los\n"
                + "Forasteros Abrazan porque escogen al individuo, no por\n"
                + "capricho o por imprudencia. Aquéllos que se ganan su\n"
                + "atención son duros, física o emocionalmente");
        Gangrel.setCreacion("La autosuficiencia es la marca\n"
                + "de los Gangrel, y la mayoría tiene Arquetipos de personalidad independientes o solitarios. Los Atributos Físicos\n"
                + "son, de lejos, los más comunes, así como los Talentos con\n"
                + "algunas nociones de Técnicas y Conocimientos. La mayoría de los Gangrel se centra más en las Disciplinas que\n"
                + "en los Trasfondos, prefiriendo confiar en sí mismos antes\n"
                + "que en otros. Los Gangrel casi nunca tienen puntuaciones significativas en Recursos, Influencia o Criados.");

        Gangrel.setDebilidad(" Siempre que un Gangrel entra en Frenesí, adquiere una característica animal temporal (que puede reemplazar una existente). Una zona con pelo, un ligero aletargamiento tras alimentarse, incomodidad entre\n"
                + "multitudes: todos éstos pueden ser signos que marquen\n"
                + "a un Forastero tras un Frenesí. Estos rasgos no tienen\n"
                + "por qué ser únicamente físicos: pueden afectar también\n"
                + "al comportamiento. Los jugadores deberían trabajar con\n"
                + "el Narrador para decidir qué nueva característica animal\n"
                + "se adquiere (en las situaciones en las que el instinto de\n"
                + "luchar o huir pueda ser relevante). Con el tiempo, o ante\n"
                + "situaciones extraordinarias, una característica animal en\n"
                + "concreto puede hacerse permanente, apareciendo una\n"
                + "nueva con el siguiente Frenesí. Una buena guía es que\n"
                + "cada rasgo de Frenesí tenga un efecto en términos del sistema (como una reducción temporal de la puntuación de\n"
                + "un Atributo Social o una pérdida permanente de Humanidad), aunque algunos Narradores pueden preferir que\n"
                + "los rasgos tengan únicamente efectos a nivel narrativo");
        Gangrel.setOrganizacion("Hay reuniones regionales de Gangrel basadas en costumbres étnicas o culturales. Son eventos informales, orientados más al intercambio de información y a\n"
                + "festejar que a hacer progresar cualquier plan secreto. Aparte\n"
                + "de estas reuniones infrecuentes, casi toda la organización de\n"
                + "los Gangrel es principalmente local, si es que existe alguna\n"
                + "en absoluto, desde parejas de Sire y Chiquillo a terribles manadas centradas alrededor de un poderoso Forastero.");

        Gangrel.addDisciplina("Animalismo");
        Gangrel.addDisciplina("Fortaleza");
        Gangrel.addDisciplina("Protean");
        Gangrel.setInsignia(new Image("media/insignias/Gangrel.png"));

        Giovanni.setDescripcion("Tras ganar prominencia durante el Renacimiento veneciano, la familia Giovanni construyó su fortuna sobre\n"
                + "el ascenso de la clase media y los rápidos beneficios de\n"
                + "la banca y el comercio en el Mediterráneo (y las empresas criminales que los acompañaban). Sin embargo,\n"
                + "al desear el paterfamilias aún más poder, junto con\n"
                + "el progreso de la familia vino el orgullo y, con\n"
                + "éste, el horror. En la cima de su poder mortal,\n"
                + "Augustus Giovanni se dedicó al arte de controlar a los muertos, ganándose así el Abrazo\n"
                + "de un Antediluviano hoy olvidado. Junto\n"
                + "con un cónclave de conspiradores, los\n"
                + "Giovanni hundieron en el olvido a\n"
                + "un Clan y construyeron su propio\n"
                + "legado sobre el cadáver.\n"
                + "Desde esas primeras noches, los\n"
                + "Giovanni no han aceptado límite alguno a sus ambiciones, a pesar de la\n"
                + "oposición de los Vástagos de fuera de\n"
                + "su Clan y de una merecida reputación como “Vástagos Diabólicos”.\n"
                + "Estudiaron artes prohibidas, volviéndose formidables en el manejo\n"
                + "de la nigromancia, que les permitió\n"
                + "tener poder sobre los espíritus de\n"
                + "los muertos, y la degeneración\n"
                + "siguió a los rituales impíos. Hoy\n"
                + "en día, los Giovanni son conocidos por el aislacionismo de su\n"
                + "Clan y las prácticas incestuosas\n"
                + "con las que lo perpetúan. Unas\n"
                + "pocas familias y grupos externos\n"
                + "están bajo su protección, pero la\n"
                + "gran mayoría del Clan proviene\n"
                + "de su corrupta familia mortal.\n"
                + "Ésta sigue medrando a pesar de\n"
                + "sus abominables caprichos, y ha\n"
                + "amasado una enorme fortuna mediante el crimen, la política y los\n"
                + "secretos de los muertos, la cual\n"
                + "los mantiene en su posición de\n"
                + "degradada opulencia.\n"
                + "En público, los Giovanni hacen gala de gran humildad y respeto. En parte es un hábito secular, adquirido\n"
                + "cuando los otros Clanes cazaban a los Necromantes\n"
                + "usurpadores (y mantenido para preservar su duramente\n"
                + "ganada neutralidad en el conflicto entre la Camarilla\n"
                + "y el Sabbat). Otra cosa es el guante de terciopelo\n"
                + "cubriendo el puño de hierro de su auténtica naturaleza, notable por doblegar tanto a fantasmas\n"
                + "como a mentes y cuerpos para que se rindan a\n"
                + "sus necesidades. Según los Giovanni, tanto\n"
                + "Príncipes como Arzobispos les deben favores, y cualquiera con algo que ofrecer puede ganar su patrocinio.\n"
                + "En su mayor parte, los Giovanni\n"
                + "apenas participan en la Jyhad, pues\n"
                + "buscan sus propios objetivos: cultivar su fortuna y asentar los cimientos\n"
                + "de su poder en las tierras tras el velo\n"
                + "de la muerte. Los ajenos a la familia\n"
                + "rara vez comprenden los objetivos\n"
                + "de los Necromantes, pues sólo los\n"
                + "más fieles a los Giovanni saben\n"
                + "que el Clan quiere llevar el mundo a un estado en donde muertos y vivos se mezclen. Y, con su\n"
                + "maestría en la Necromancia, los\n"
                + "Giovanni estarían en posición de\n"
                + "gobernarlos a todos");

        Giovanni.setApodo("necromantes");
        Giovanni.setApariencia(" Exteriormente,\n"
                + "los Giovanni visten con discreción y buen gusto. La mayoría\n"
                + "proviene de su familia mortal\n"
                + "original y no sólo son de piel\n"
                + "aceitunada como muchos italianos, sino que también presentan algunos rasgos heredados de su familia. Quienes no\n"
                + "son parientes cercanos son\n"
                + "fáciles de identificar, y se visten como sea costumbre en la\n"
                + "región de su rama familiar.");
        Giovanni.setRefugio(" La fortuna de los Giovanni es evidente en sus\n"
                + "refugios, que suelen ser villas o lujosas fincas. Los Necromantes a menudo tienen objetos de valor en ellos, desde\n"
                + "galerías de arte a expositores de joyas. Muchos Giovanni\n"
                + "tienen además refugios secundarios, donde pueden tener\n"
                + "complejas criptas necrománticas o ser sencillamente pisos en los que ocultarse si fuera necesario");

        Giovanni.setCreacion(" Los Giovanni habitualmente\n"
                + "tienen Conductas sociables y profesionales que ocultan\n"
                + "crueles Naturalezas retorcidas durante su educación. Los\n"
                + "Atributos Mentales o Sociales son generalmente primarios, aunque algunos “soldados” de la familia prefieren los\n"
                + "Físicos. El mismo énfasis hace que se primen los Conocimientos o los Talentos, dependiendo de la propensión\n"
                + "personal. La parte del Clan que prefiere los Trasfondos\n"
                + "prácticos (particularmente, los relacionados con los bienes materiales y el ejercicio de su influencia) diverge de\n"
                + "quienes prefieren el poder prohibido de las Disciplinas.\n"
                + "Pocos Giovanni podrían ser descritos como equilibrados.");

        Giovanni.setDebilidad("El Beso de los Giovanni causa un dolor\n"
                + "insoportable a los mortales que lo reciben. Si uno de\n"
                + "ellos no es cuidadoso, su víctima podría morir a causa del\n"
                + "shock y la agonía antes de ser desangrado completamente. Cuando un Giovanni se alimenta de un mortal, hace\n"
                + "el doble de daño que infligiría el Beso de otro vampiro.\n"
                + "Por ejemplo, si un Giovanni toma un punto de Sangre\n"
                + "de un recipiente mortal, la víctima sufre dos niveles de\n"
                + "Salud de daño. Como resultado, tienden a utilizar bancos de sangre y otros medios de alimentarse menos problemáticos");

        Giovanni.setOrganizacion("Piramidales como pocos otros Clanes,\n"
                + "los Necromantes tienen una estructura en la cual las decisiones las toma el aún (presuntamente) activo progenitor del Clan, Augustus. La familia mantiene un enorme\n"
                + "palazzo llamado el Mausoleo en Venecia, donde tanto\n"
                + "Antiguos como Retoños bailan al son que marcan los vetustos vampiros moviendo los hilos del Clan. La estructura de éste es familiar, con las complicaciones añadidas\n"
                + "que ofrecen la degeneración y el vampirismo. El incesto,\n"
                + "la adoración de los ancestros, la necrofilia, los cultos al\n"
                + "remordimiento y anormales relaciones en las que padres y\n"
                + "abuelas son Chiquillos de su propia descendencia, enmarañan aún más Clan y familia y quiebran la mente de muchos Giovanni aún antes de transformarse en Vástagos.");

        Giovanni.addDisciplina("Dominacion");
        Giovanni.addDisciplina("Necromancia");
        Giovanni.addDisciplina("Potencia");
        Giovanni.setInsignia(new Image("media/insignias/Giovanni.png"));

        Lasombra.addDisciplina("Dominacion");
        Lasombra.addDisciplina("Obtenebración");
        Lasombra.addDisciplina("Potencia");
        Lasombra.setInsignia(new Image("media/insignias/Lasombra1.png"));

        Malkavian.addDisciplina("Auspex");
        Malkavian.addDisciplina("Dementación");
        Malkavian.addDisciplina("Ofuscación");
        Malkavian.setInsignia(new Image("media/insignias/Malkaian.png"));

        Nosferatu.addDisciplina("Animalismo");
        Nosferatu.addDisciplina("Ofuscación");
        Nosferatu.addDisciplina("Potencia");
        Nosferatu.setInsignia(new Image("media/insignias/Nosferatu.png"));

        Ravnos.addDisciplina("Dominacion");
        Ravnos.addDisciplina("Obtenebración");
        Ravnos.addDisciplina("Quimerismo");
        Ravnos.setInsignia(new Image("media/insignias/Ravnos.png"));

        Caitiff.setInsignia(new Image("media/insignias/Caitiff.png"));

        Seguidores_de_Set.addDisciplina("Ofuscación");
        Seguidores_de_Set.addDisciplina("Presencia");
        Seguidores_de_Set.addDisciplina("Serpentis");
        Seguidores_de_Set.setInsignia(new Image("media/insignias/Seguidores-de-Set.png"));

        Toreador.addDisciplina("Auspex");
        Toreador.addDisciplina("Celeridad");
        Toreador.addDisciplina("Presencia");
        Toreador.setInsignia(new Image("media/insignias/Toreador.png"));

        Tremere.addDisciplina("Auspex");
        Tremere.addDisciplina("Dominacion");
        Tremere.addDisciplina("Taumaturgia");
        Tremere.setInsignia(new Image("media/insignias/Tremere.png"));

        Tzimisce.addDisciplina("Animalismo");
        Tzimisce.addDisciplina("auspex");
        Tzimisce.addDisciplina("Vicisitud");
        Tzimisce.setInsignia(new Image("media/insignias/Tzimisce.png"));

        Ventrue.addDisciplina("Dominacion");
        Ventrue.addDisciplina("Fortaleza");
        Ventrue.addDisciplina("Presencia");
        Ventrue.setInsignia(new Image("media/insignias/Ventrue.png"));
//---------------------------------------------------
//---------------------------------------------------
        Lasombra.setDescripcion("Para la mente de los Lasombra, es mejor reinar en el\n"
                + "infierno que servir en el cielo. El miedo, el Frenesí, la\n"
                + "capacidad de determinar si otro vive o muere: éstas son\n"
                + "las raíces del poder que los Lasombra tienen en tan alta\n"
                + "estima. Mientras otros vampiros tratan en vano de mantener a la Bestia bajo control o ceder completamente\n"
                + "ante ella, los Lasombra golpean a la Bestia hasta\n"
                + "que la someten, invocándola cuando les\n"
                + "conviene pero dejándola atrapada en\n"
                + "su interior cuando\n"
                + "desean controlarse.\n"
                + "Es debido a estas\n"
                + "predilecciones que\n"
                + "los Lasombra se consideran una “nobleza\n"
                + "oscura”, una aristocracia de la noche que\n"
                + "escoge la supremacía\n"
                + "de los Cainitas\n"
                + "por encima\n"
                + "de la veneración de la Mascarada. Con respecto a ideas\n"
                + "tales como redención o salvación son cínicos en el mejor\n"
                + "de los casos, y gran parte de la pompa que formó la actitud\n"
                + "del Clan antes de la existencia del Sabbat permanece sólo\n"
                + "como la más negra ironía o una burla abierta. No obstante,\n"
                + "los Lasombra todavía aprecian la grandeza y los rituales\n"
                + "de la Iglesia y de la aristocracia; además, el Clan fue fundamental no sólo al establecer muchos de los rituales del\n"
                + "Sabbat, sino también las instituciones que evitan que éste\n"
                + "sucumba al caos cada noche.\n"
                + "Tanto si se ven como instrumentos de Dios o como desterrados de Su creación, los Lasombra creen que tienen\n"
                + "un deber (ya sea con su Secta, Clan, manada o incluso\n"
                + "simplemente con ellos mismos), y el compromiso con sus\n"
                + "responsabilidades les otorga una retorcida sensación de\n"
                + "servir a una causa. Incluso un Cabezapala Lasombra puede considerarse a sí mismo superior a los demás; un sorprendente número de los Lasombra Abrazados en masa\n"
                + "sobreviven, quizás gracias a la intervención de sus Sires.\n"
                + "Aunque la noche pertenece a todos los Vástagos, los\n"
                + "Lasombra han nacido realmente en la oscuridad, hasta el\n"
                + "punto de que el propio nombre de su Clan manifiesta sus\n"
                + "lazos con las sombras. Suya es la Disciplina Obtenebración, y les permite manipular el material del que están hechas las sombras y la oscuridad, e incluso llegar más allá de\n"
                + "la oscuridad del mundo físico e introducirse en el Abismo\n"
                + "que yace tras ella.");
        Lasombra.setApodo("Guardianes (como en «el guardián de mi hermano»).");
        Lasombra.setSecta("Sabbat");
        Lasombra.setSecta_des(" El Sabbat sería muy diferente sin la influencia\n"
                + "de los Lasombra, y sigue siendo su Clan más prominente.\n"
                + "Los jóvenes Lasombra a menudo tienen prometedores\n"
                + "comienzos como Ducti o Sacerdotes del Sabbat, dirigiendo a sus compañeros a la lucha o demostrando su\n"
                + "dominio sobre la Bestia.");
        Lasombra.setApariencia(": Los Lasombra suelen ser atractivos. Ya sea\n"
                + "por la ascendencia española, italiana o morisca asociada\n"
                + "con el Clan, o por trasfondos modernos más cosmopolitas, los Guardianes mantienen una figura imponente. Su\n"
                + "ropa a menudo es conservadora o religiosa, procedente\n"
                + "de años de ceremonia y fiel ritual. Raro es el Lasombra\n"
                + "que no puede al menos manipular las sombras para escenificar una entrada dramática o una pose enigmática");

        Lasombra.setRefugio(" La obligación del liderazgo conduce a muchos Lasombra jóvenes a mantener Refugios Comunales\n"
                + "con otros miembros de su manada. Los Guardianes más\n"
                + "ricos y los que son anteriores a la Secta a menudo tienen\n"
                + "sus propios refugios, ya sean suites en siniestros áticos o\n"
                + "enormes villas del Viejo Mundo");
        Lasombra.setTrasfondo("Los futuros Sires del Clan Lasombra buscan tanto erudición como ambición en sus Chiquillos\n"
                + "potenciales. Así, muchos Lasombra tienen antecedentes\n"
                + "profesionales y presentan personalidades extrovertidas e\n"
                + "incluso agresivas. El mérito a los ojos de sus Sires lleva\n"
                + "lejos a los Retoños Lasombra, y los Guardianes no dudan en purgar sus filas de Chiquillos defectuosos, vagos\n"
                + "o groseros");
        Lasombra.setCreacion(" Los Lasombra suelen tener\n"
                + "Naturalezas y Conductas dispares. Los Atributos Sociales y Mentales son los primarios con la misma frecuencia.\n"
                + "Las Habilidades tienden a ser escasas y a estar especializadas, como muestra de las pericias individuales. Los\n"
                + "Guardianes se interesan por todo tipo de Trasfondos por\n"
                + "igual en (inicialmente) pequeñas cantidades, para poder\n"
                + "diversificarse mejor");

        Lasombra.setDebilidad(" Los vampiros Lasombra no tienen reflejo. Ya sea en un espejo, en un cuerpo de agua, sobre una\n"
                + "superficie pulida o en el retrovisor de un taxi, la imagen\n"
                + "de los Guardianes no se refleja");
        Lasombra.setOrganizacion(" Para los Lasombra, las noches de la alta\n"
                + "aristocracia nunca acabaron, y los títulos y cargos que un\n"
                + "observador moderno podría asociar con el pasado aún\n"
                + "tienen gran peso entre los Guardianes. Un complejo sistema de patronazgo, tutelaje y linaje caracteriza al Clan,\n"
                + "similar al de cortes e iglesias de siglos pretéritos. Los Chiquillos se benefician enormemente de los Sires más estimados y viceversa, mientras que los actos que confieren\n"
                + "estatus en la Secta o en el Clan también pueden elevar a\n"
                + "los compañeros del Lasombra siempre que asocie su éxito\n"
                + "con ellos");

        Malkavian.setDescripcion("Los Malkavian están doblemente malditos: una vez\n"
                + "por la maldición de ser Vástagos y otra, por la extrema\n"
                + "confusión que perturba sus corazones y mentes. Tras el\n"
                + "Abrazo, todo Malkavian se ve afectado por una locura insuperable que quiebra su comportamiento noche tras noche a partir de ese momento, llenando\n"
                + "su no-vida de locura. Algunos lo consideran una\n"
                + "forma de percepción oracular, mientras que otros\n"
                + "simplemente los consideran peligrosos.\n"
                + "Que nadie se engañe: la locura de los Luná-\n"
                + "ticos es un alienante y doloroso fenómeno que\n"
                + "causa aislamiento, pero que ocasionalmente les\n"
                + "otorga un destello de comprensión o un punto de\n"
                + "vista hasta entonces desconocido. Esta locura puede\n"
                + "tomar la forma de una enfermedad mental clínica o\n"
                + "puede ser una forma de hipersensibilidad de los sentidos que otros desconocen tener; un titiritero sobrenatural moviendo los hilos del Malkavian o la\n"
                + "sensación de que el Lunático está de algún modo\n"
                + "más avanzado evolutivamente. Un Malkavian\n"
                + "puede creer ser una idea que ha cobrado forma\n"
                + "física o el avatar de un concepto que el Mundo de Tinieblas aún ha de encontrar. Puede ser\n"
                + "un psicópata salvaje e imparable, o puede ser un\n"
                + "individuo mayormente lúcido que a veces queda catatónico por miedo a un cataclismo cósmico inminente.\n"
                + "Su precaria estabilidad dificulta que los otros Vástagos\n"
                + "(o cualquier mortal con el que se encuentren) interactúen con los Malkavian. El Clan a veces se recrea en\n"
                + "elaboradas, terroríficas y peligrosas “bromas” que los ayudan poco a ganarse la simpatía de los demás vampiros.\n"
                + "Estos incidentes en teoría sirven para educar al objetivo,\n"
                + "pero a menudo la lección puede perderse entre los intentos del vampiro de ponerse a salvo y la incapacidad para\n"
                + "analizar la lógica interna del Malkavian. Bromas comunes podrían ser reemplazar la puerta del refugio de un\n"
                + "banal Toreador por una guillotina, redistribuir la fortuna\n"
                + "de un Antiguo Brujah mientras éste se encuentra en el\n"
                + "Elíseo o, incluso, dar información de dónde se reúnen los\n"
                + "Nosferatu a un cazador. Los Vástagos temen y odian la\n"
                + "palabra “broma” casi tanto como a los mismos Lunáticos");
        Nosferatu.setDescripcion("Quienes dudan que el Abrazo sea una maldición sólo\n"
                + "tienen que mirar a los Nosferatu. El Abrazo deforma a\n"
                + "los miembros de este Clan convirtiéndolos en horribles\n"
                + "monstruos retorcidos por la marca de Caín. Como tales,\n"
                + "merodean y se ocultan en las sombras, y a menudo causan la ira y la burla de otros Vástagos por su horripilante\n"
                + "aspecto. Otros están tan aterrorizados o asqueados por\n"
                + "los Nosferatu que estos retorcidos Vástagos apenas tienen interacción social alguna.\n"
                + "Para ser justos, los Nosferatu llegan a\n"
                + "poseer muchos de los secretos\n"
                + "susurrados por sus reacios camaradas. Las Ratas de Alcantarilla disfrutan de un\n"
                + "reticente respeto\n"
                + "como comerc i a n t e s\n"
                + "de información de los Vástagos, dada su capacidad para\n"
                + "el sigilo y el hecho de que muchos Vástagos los ignorarían antes que prestarles atención. Los Nosferatu hábiles\n"
                + "aprovechan al máximo esta situación, utilizando la hipocresía de otros vampiros en su provecho.\n"
                + "A grandes rasgos, la condición de los Nosferatu es solitaria y aislada. Cómo reaccionan a la Maldición de Caín varía según su actitud y resistencia mental, pero es difícil ser\n"
                + "objeto de una repulsión absoluta y no dejar que esto cambie tu disposición hacia el resto de los Vástagos de alguna\n"
                + "manera. Algunas Ratas de Alcantarilla son crueles, tan\n"
                + "retorcidas en su interior como lo son en su exterior, mientras que otras son criaturas trágicas y desgraciadas, que han\n"
                + "sido malditas con una eterna condición de marginados sin\n"
                + "ninguna capacidad de elección. Algunos de ellos incluso\n"
                + "adoptan el papel de profetas o avatares de los Condenados,\n"
                + "encarnado físicamente el fantasmagórico acertijo, “Bestia\n"
                + "soy, para en bestia no convertirme”.");
        Ravnos.setDescripcion("Los Ravnos se mueven como los rumores que los rodean.\n"
                + "Son el ladrón en la noche, el raksha perseguido por el viento, las pesadillas demasiado temibles como para ser reales.\n"
                + "Tanto si se los asocia con el pueblo romaní de Europa del\n"
                + "Este o con los ladrones de tumbas ghûl del Asia occidental,\n"
                + "la sociedad de los Vástagos carga a los Ravnos con prejuicios de podredumbre moral, suciedad y picaresca.\n"
                + "Con una reputación como ésa, se considera a los\n"
                + "Ravnos marginados incluso entre aquellos Vástagos que no se alían con las Sectas. Muchos jó-\n"
                + "venes Ravnos tienden hacia no-vidas nómadas,\n"
                + "moviéndose de un dominio al siguiente o escondiéndose en los límites de los territorios\n"
                + "establecidos desde donde pueden escapar si el sentir de los Vástagos locales\n"
                + "se vuelve en su contra. Esto exacerba\n"
                + "su reputación como vagabundos, gitanos y plagas errantes, pero los\n"
                + "vampiros Ravnos se\n"
                + "adaptan bien, prosperando en sus papeles de marginados.\n"
                + "De hecho, muchos\n"
                + "escogen convertirse\n"
                + "en los terrores salvajes\n"
                + "que los otros Vástagos\n"
                + "creen que son.\n"
                + "Los más cultivados\n"
                + "entre los Ravnos siguen\n"
                + "una ideología propia del\n"
                + "Clan inspirada en el ciclo de la reencarnación a\n"
                + "la que se adhieren muchas\n"
                + "creencias de la India. No\n"
                + "obstante, entre algunos\n"
                + "miembros jóvenes y amorales del Clan, esta filosofía se convierte en una\n"
                + "inclinación al capricho o\n"
                + "una excusa para el caos.\n"
                + "Son estos últimos Vástagos los que dan un mal\n"
                + "nombre a los Ravnos, pero incluso los devotos resultan\n"
                + "extraños para muchos vampiros.\n"
                + "Los Ravnos practican una singular Disciplina conocida como Quimerismo que convence a sus enemigos de\n"
                + "que ven cosas que realmente no existen. Ésta es la culpable de que los otros Vástagos piensen que los Ravnos\n"
                + "comercian con mentiras y engaños, pero también\n"
                + "puede probar ser la salvación de un Embustero y facilitar los caprichos de una\n"
                + "no-vida marginal.");
        Seguidores_de_Set.setDescripcion("La adicción, el envilecimiento, la corrupción y la desesperación aterrorizan a muchos Vástagos que temen que su\n"
                + "no-vida sea un fracaso, pero para los Seguidores de Set,\n"
                + "éstas y muchas otras son las herramientas\n"
                + "con las que comercian. Chulos,\n"
                + "camellos y sacerdotes, los Setitas satisfacen las necesidades de los desesperados y,\n"
                + "al hacerlo, los convierten\n"
                + "a una causa nihilista.\n"
                + "Tanto si uno necesita\n"
                + "placeres carnales, dinero, drogas u oscuros\n"
                + "secretos, los Seguidores de Set\n"
                + "pueden proveerlo y, cuando lo hacen, se aseguran de que\n"
                + "aquéllos que los buscan volverán.\n"
                + "Los Seguidores de Set son tanto una religión ctónica\n"
                + "como un Clan, aunque el Clan es parte de su doctrina. Su\n"
                + "mitología es compleja y enrevesada, un panteón impenetrable de dioses monstruosos. En la cúspide de su culto se\n"
                + "sitúa un sincretismo de Set, el señor egipcio del Inframundo, y la hidra griega Tifón, tanto guardianes espirituales de\n"
                + "los lugares secretos como “libertadores” de las almas ajenas. Para los demás, todo esto es una afectación religiosa y\n"
                + "blasfema, pero para los devotos Setitas el culto y la causa\n"
                + "son reales, y su señor oscuro actúa a través de ellos.\n"
                + "No es necesario decir que la política de desesperación\n"
                + "y el aplacamiento de sus malvados dioses sitúan a las\n"
                + "Serpientes fuera de la sociedad de los Vástagos. A los\n"
                + "Setitas ya les va bien así. Los vampiros a menudo tienen\n"
                + "necesidad de algo que ofrecen los Seguidores de Set, y\n"
                + "éstos están muy felices de, además, guardar el secreto… por un cuantioso precio. Los Setitas ofrecen un\n"
                + "pacto con el diablo, pero en sus propios términos. De\n"
                + "esa manera, cuando reciben su pago y alimentan con\n"
                + "sangre y almas las fauces de Tifón, todos los sacrificios han sido entregados de forma voluntaria.");
        Toreador.setDescripcion("Desde la perspectiva de los Toreador, cuando el Sol se\n"
                + "pone, la oscuridad da paso a un mundo eterno y asombroso. Todo está cargado de fascinación y horror, baja política y glorias sensuales, lo profundo y lo profano, y un\n"
                + "innegable trasfondo de crueldad. Estos Vástagos son los\n"
                + "Toreador, y pasan sus no-vidas cobijados en el placer.\n"
                + "Por supuesto, para vampiros con estas inclinaciones es fácil hastiarse y amargarse. Más que\n"
                + "los otros Clanes, suelen sucumbir al tedio, y\n"
                + "combaten el aburrimiento ocasional de la\n"
                + "estática inmortalidad jugando a las rivalidades. El exceso de estímulos los vuelve\n"
                + "esclavos de las sensaciones que buscan.\n"
                + "Los Toreador más inmorales pueden convertirse en\n"
                + "auténticos monstruos, hundiéndose en niveles inimaginables de depravación\n"
                + "buscando sentir algo.\n"
                + "Los Vástagos del Clan\n"
                + "Toreador suelen involucrarse mucho en el mundo de los\n"
                + "mortales. Tienen infinitas razones,\n"
                + "ya sea disfrutar de la proximidad\n"
                + "del hálito de la vida, cultivar auténticos cultos de seguidores que\n"
                + "los adoren, o influir y seguir las\n"
                + "modas de las que su propia clase se\n"
                + "burla y venera. Según los Toreador,\n"
                + "ellos son las musas de un desesperado mundo mortal, sirviéndoles de\n"
                + "inspiración gracias a su belleza o su\n"
                + "patronazgo.\n"
                + "La cultura de los Toreador es una mezcla\n"
                + "de sibaritas, diletantes y visionarios. Algunos Toreador, aún con ecos de pasión\n"
                + "mortal, Abrazan a amantes o “proyectan”\n"
                + "Progenie que parece desafiar todas sus costumbres. Éstos o bien no duran demasiado\n"
                + "o se alzan para alcanzar gran prominencia como subversivos e individualistas.\n"
                + "Ideas, tendencias y “el próximo bombazo” se difunden a través del Clan, y\n"
                + "el resto de los Vástagos normalmente\n"
                + "observa a los Toreador para que los guíen. Los Degenerados lo saben, y muchos acaban siendo Arpías, Príncipes\n"
                + "y otras figuras clave de la sociedad vampírica.");
        Tremere.setDescripcion("En noches olvidadas por el paso del tiempo existían los\n"
                + "Tremere aunque, por aquel entonces, eran... diferentes.\n"
                + "Esos primeros Tremere hicieron un pacto (o pergeñaron\n"
                + "un hechizo o cualquier otro método horrible atribuido\n"
                + "al Clan) que los transformó en los vampiros que son actualmente. Algunos dicen que robaron la Maldición de\n"
                + "Caín de un Antediluviano en Letargo o que destilaron\n"
                + "la imperfecta inmortalidad de los Vástagos a partir de la\n"
                + "Vitae robada de otros vampiros. Estos misteriosos orígenes, que algunos describen como traicioneros e incluso\n"
                + "blasfemos, persiguen a los Tremere, pues el resto de los\n"
                + "Clanes los miran con desconfianza y sospecha. Su historia (y, de hecho, su legado moderno) está marcada por\n"
                + "la guerra de Clanes, resentimientos de hace siglos, y la\n"
                + "mancha de perniciosos misterios jamás resueltos.\n"
                + "En las noches actuales, es la práctica de la Magia\n"
                + "de Sangre la que ha dado forma al Clan\n"
                + "Tremere. La Taumaturgia, una Disciplina flexible, está muy arraigada entre los\n"
                + "Tremere, quienes mantienen refugios\n"
                + "en forma de cultos conocidos como\n"
                + "Capillas para estudiar sus usos y\n"
                + "compartir secretos entre\n"
                + "ellos. Para ellos, la sangre\n"
                + "es tanto sustento como\n"
                + "fuente de poder místico;\n"
                + "se reúnen en sus casas de\n"
                + "brujos para ampliar sus conocimientos sobre la Vitae\n"
                + "que es un elemento crucial en sus no-vidas.\n"
                + "Además de por la práctica de la Taumaturgia misma, se conoce a los Brujos por su\n"
                + "férrea jerarquía. Provienen del Viejo Mundo,\n"
                + "donde tienen una base de poder establecida en Viena\n"
                + "a la que todos sus miembros responden en mayor o\n"
                + "menor medida. Aunque pueden ser uno de los Clanes\n"
                + "más jóvenes (en los términos en los que las criaturas inmortales como los vampiros miden el tiempo)\n"
                + "son tan hábiles en la Jyhad como el resto de los Vástagos. Rodeados de enemigos que los llaman Usurpadores\n"
                + "y respaldados por aliados que pueden respetar o no las\n"
                + "alianzas que han logrado imponer, los Tremere han evolucionado para ser autosuficientes. De hecho, muchos de\n"
                + "los que los vigilan cautelosamente piensan que poseen\n"
                + "una ventaja demasiado grande, gracias a su flexible Disciplina y a la estructura protectora del Clan y las Capillas, y\n"
                + "se mueven en su contra tanto secreta como abiertamente.");
        Tzimisce.setDescripcion("Una Luna de sangre proyecta luz carmesí sobre la tierra\n"
                + "más allá del bosque y algo temible aúlla, agónico, en la\n"
                + "noche. Los Tzimisce llaman a estas tierras su hogar ancestral. Desde tiempos inmemoriales los Demonios han sido\n"
                + "amos y señores de los dominios de gran parte de Europa\n"
                + "del Este. Su Clan es orgulloso y egoísta, y para él las tradiciones sólo tienen valor hasta cierto punto, pese a sus orí-\n"
                + "genes nobles. De hecho, reivindican haber destruido a su\n"
                + "Antediluviano y que, a consecuencia de ese trascendental\n"
                + "evento, ayudaron a edificar los cimientos del Sabbat.\n"
                + "Practican una extraña Disciplina conocida como Vicisitud que les permite retorcer la piel y los huesos de sus\n"
                + "víctimas: suelen refinar sus artes de la carne\n"
                + "practicando sobre ellos mismos, pero la\n"
                + "usan con la misma frecuencia en lacayos y criados, transformando a boyardos\n"
                + "y Szlachta en monstruosos esclavos. La\n"
                + "propia Vicisitud es una Disciplina mal\n"
                + "entendida, y ocasionalmente los debates\n"
                + "sobre sus orígenes sumergen al Clan en\n"
                + "enconadas rivalidades.\n"
                + "El Tzimisce es un Clan de extremos:\n"
                + "largas y frías noches pasadas en remotos\n"
                + "castillos han hecho que la atención de los\n"
                + "Demonios se dirija tanto hacia el exterior\n"
                + "como hacia el interior. Los místicos del Clan\n"
                + "estudian una filosofía de la metamorfosis, buscando descubrir lo que yace más allá del estado\n"
                + "vampírico. Muchos Tzimisce se caracterizan por\n"
                + "una extraña espiritualidad seglar. Los jóvenes a menudo se sienten desligados del papel histórico de\n"
                + "los Demonios como terroríficos señores feudales, y\n"
                + "se entregan a una causa de su propia elección, ya\n"
                + "sea como fanáticos del Sabbat, horrores de carne\n"
                + "moldeada o trascendentales hechiceros Koldun.");
        Ventrue.setDescripcion("A través de la historia, mientras que los otros Clanes\n"
                + "se han arrastrado con sus pequeñas intrigas, los Ventrue\n"
                + "han cosechado el favor del César, susurrado al oído de\n"
                + "Carlomagno, financiado la Era de los Descubrimientos e,\n"
                + "incluso, influido en la política de la Santa Sede. El suyo\n"
                + "es un legado de gobierno, desde los\n"
                + "Retoños Ventrue en su ascenso\n"
                + "a la cima hasta los más poderosos Antiguos cuya influencia\n"
                + "abarca el mundo entero. Han\n"
                + "jugado durante mucho tiempo\n"
                + "a poner reyes en las sombras del\n"
                + "mundo mortal, y han sido durante\n"
                + "mucho tiempo el Clan de los Reyes entre los Vástagos.\n"
                + "El resto de los Clanes encuentra todo esto insufriblemente\n"
                + "pomposo en el mejor de\n"
                + "los casos, tediosamente\n"
                + "punible en el peor. Alguien tiene que dirigir\n"
                + "pero, ¿por qué siempre\n"
                + "tiene que ser un Ventrue con ínfulas? Los\n"
                + "Sangre Azul tratan de\n"
                + "soportar las críticas\n"
                + "de sus inferiores con\n"
                + "un sentido de noblesse oblige (pesada es siempre la\n"
                + "cabeza que lleva\n"
                + "la corona) pero incluso los líderes Vástagos más generosos sucumben\n"
                + "ocasionalmente a la tiranía y a la\n"
                + "rabia sangrienta.\n"
                + "En las noches actuales, los\n"
                + "Ventrue son una síntesis de lo\n"
                + "moderno y lo antiguo, a menudo en duro contraste dentro del\n"
                + "Clan y unos con otros. Suyo es\n"
                + "el dinero antiguo, de las bóvedas de\n"
                + "Creso, pero los jóvenes manipulan los\n"
                + "mercados financieros e influyen en las divisas. Los Antiguos pueden dirigir a ejércitos e incluso gobiernos al completo, mientras los Neonatos conjuran sus activos desde\n"
                + "una página web o una aplicación móvil. Pero a pesar de\n"
                + "toda su fortuna, su distinguida historia y su posición entre\n"
                + "los Condenados, todos y cada uno de los Ventrue aún deben buscar el único recurso que hace igualitaria a toda\n"
                + "la sociedad de la Estirpe: la preciosa Sangre.");

        Malkavian.setApodo("Lunaticos");
        Nosferatu.setApodo("Rata de alcantarillas");
        Ravnos.setApodo("Embusteros");
        Seguidores_de_Set.setApodo("Setitas, Serpientes");
        Toreador.setApodo("Degenerados");
        Tremere.setApodo("Brujos");
        Tzimisce.setApodo("Demonios");
        Ventrue.setApodo("Sangre azul");

        Malkavian.setSecta("Camarilla");
        Nosferatu.setSecta("Camarilla");
        Ravnos.setSecta("Independiente");
        Seguidores_de_Set.setSecta("Independiente");
        Toreador.setSecta("Camarilla");
        Tremere.setSecta("Camarilla");
        Tzimisce.setSecta("Sabbat");
        Ventrue.setSecta("Camarilla");

        Malkavian.setSecta_des(" En sus momentos de lucidez, los Malkavian\n"
                + "ofrecen puntos de vista poco ortodoxos y hacen de abogados del diablo para la Camarilla, ofreciendo sus visiones y su singular comprensión para cortar las redes\n"
                + "de engaños. Los Príncipes y Primogénitos toleran a los\n"
                + "Lunáticos en diverso grado, pero el Clan como entidad\n"
                + "siempre ha apoyado a la Torre de Marfil.");
        Nosferatu.setSecta_des("Al menos nominalmente, el Clan Nosferatu\n"
                + "pertenece a la Camarilla, aunque muchos de sus miembros se vuelven Autarcas o apoyan a los Anarquistas\n"
                + "en lugar de navegar por el mezquino laberinto social de\n"
                + "la Torre de Marfil. Algunos incluso mantienen que los\n"
                + "Nosferatu necesitan a la Camarilla porque sin ella no\n"
                + "tendrían compradores para su tráfico de secretos.");
        Ravnos.setSecta_des("Al Clan Ravnos suele costarle hacer caso del riguroso orden de las\n"
                + "ciudades de la Camarilla, y no posee el\n"
                + "inherente amor por la violencia del Sabbat. Así, los Embusteros son Independientes por falta de una opción mejor.");
        Seguidores_de_Set.setSecta_des("Aparentemente ninguna de las Sectas aceptaría a los Seguidores de Set. De puertas\n"
                + "adentro, los Setitas a veces se describen en términos tanto de Secta como de Clan. No tienen\n"
                + "un interés real por unirse ni a la Camarilla ni\n"
                + "al Sabbat, y sus objetivos son diferentes a los\n"
                + "de los Anarquistas.");
        Toreador.setSecta_des("La Camarilla no habría sobrevivido en las noches que siguieron a la Revuelta Anarquista sin\n"
                + "la participación sustancial de los Toreador, y\n"
                + "permanecen entre sus más apasionados partidarios.");
        Tremere.setSecta_des(" El Clan Tremere se considera uno de los Pilares de\n"
                + "la Camarilla. Se rumorea que una vez realizaron un ritual\n"
                + "que erradicó a todos aquéllos del Clan que\n"
                + "no eran leales a la Torre de Marfil (y,\n"
                + "por lo tanto, a la jerarquía piramidal de los Tremere).");
        Tzimisce.setSecta_des(" Los Tzimisce son miembros desde hace\n"
                + "mucho tiempo, aunque en gran medida distanciados, del Sabbat. Fueron fundamentales en el nacimiento de la Secta, y continúan siendo uno de sus\n"
                + "Clanes más numerosos.");
        Ventrue.setSecta_des(" Según los Ventrue, la misma idea de la Camarilla tuvo su origen en ellos. El resto de los Clanes se\n"
                + "dieron cuenta de la inestimable proposición que suponía y se arremolinaron en torno a su bandera.");

        Malkavian.setApariencia(" Pese a que los Malkavian pueden provenir de cualquier cultura, la locura que sigue al Abrazo\n"
                + "tiende a dirigirlos a extremos en cuanto a su aspecto.\n"
                + "Pueden aparecer desaliñados, heridos o, simplemente,\n"
                + "sucios. Podrían llevar aún las mismas ropas de la noche\n"
                + "de su Abrazo o haberlas robado de una lavandería o una tienda durante un momento de confusión o fuga disociativa. Por supuesto, es igual de posible que los Malkavian\n"
                + "sean meticulosos y estrictos con su apariencia, tratando\n"
                + "obsesivamente de parecer lo más normales posible");
        Nosferatu.setApariencia(": Los Vástagos Nosferatu a menudo tienen sus\n"
                + "refugios lejos del desdén y el desprecio del resto de los vampiros. Tanto si construyen sus madrigueras en las alcantarillas que sugiere su apodo como si esculpen un vasto nido de pesadilla en lo alto del campanario de una iglesia en ruinas,\n"
                + "las Ratas de Alcantarilla valoran el secretismo y prefieren\n"
                + "estar en su refugios lejos de sus enemigos. Los Nosferatu de\n"
                + "comportamiento más humilde pueden ocultarse en un edificio abandonado en un callejón poco transitado. Mientras\n"
                + "esté lejos de los demás Vástagos, es un buen refugio");
        Ravnos.setApariencia("Los Ravnos jóvenes a menudo provienen de población romaní de\n"
                + "Europa del Este, con un escaso número de\n"
                + "gadje (payos, “no gitanos”) en sus filas. Se\n"
                + "supone que los pocos Antiguos del Clan\n"
                + "que pueden quedar tienen su origen en\n"
                + "la India o en Oriente Medio. Dado que el\n"
                + "Clan está muy extendido y que no mantienen un dominio central tradicional, no se\n"
                + "puede decir que predomine una apariencia concreta, y cualquier Vástago mendigo puede ser de origen Ravnos.");
        Seguidores_de_Set.setApariencia(" Muchos de los Setitas más viejos provienen de etnias norteafricanas y mediterráneas nativas del territorio histórico de las\n"
                + "Serpientes, pero Abrazan libremente entre los mortales\n"
                + "de sus territorios adoptados. Algunos de los templos más\n"
                + "antiguos de los Setitas están ubicados en lugares donde las Serpientes “egipcias” podrían parecer fuera de\n"
                + "lugar pero en los que, sin embargo, las serpientes se\n"
                + "encuentran presentes en la mitología local, como en\n"
                + "Mesoamérica o incluso en territorios nórdicos; de esteVAMPIRO LA MASCARADA EDICIÓN 20º ANIVERSARIO 65\n"
                + "Cita: Sé qué necesitas.\n"
                + "Estereotipos\n"
                + "Assamitas: No son diferentes de nosotros, y eso les\n"
                + "aterroriza.\n"
                + "Brujah: Podríamos haber salvado su preciosa Cartago, pero, en su orgullo, eligieron una eternidad de\n"
                + "ridículo y fracaso.\n"
                + "Gangrel: No confundas su hosquedad con noble\n"
                + "salvajismo. Tienen sus vicios, como todos los demás.\n"
                + "Giovanni: Se distraen con los métodos y olvidan\n"
                + "sus objetivos.\n"
                + "Lasombra: Tras muchos exitosos Lasombra se\n"
                + "esconde una deuda con el templo.\n"
                + "Malkavian: Son excelentes aliados porque nadie\n"
                + "les presta atención, y cuando les toque pagar sus\n"
                + "deudas, todo lo que podrán hacer será farfullar.\n"
                + "Nosferatu: Forja una buena relación o te encontrarás arrastrado ante un Príncipe o Arzobispo\n"
                + "con ellos como testigos.\n"
                + "Ravnos: Lo siento, no acepto crédito. No de ti.\n"
                + "Toreador: ¡Clin, clin, clin!\n"
                + "Tremere: Uno de cada cien se da cuenta de lo que\n"
                + "podríamos hacer juntos. Los demás son unos estirados.\n"
                + "Tzimisce: El Dragón no es la única Serpiente\n"
                + "entre los Condenados.\n"
                + "Ventrue: Deja que nos odien en público mientras\n"
                + "sigan comprando.\n"
                + "Caitiff: ¡Cuán rápidamente se convierte a los maltratados!\n"
                + "Camarilla: La hipocresía es genial para los negocios.\n"
                + "Sabbat: Un paso adelante, dos pasos atrás, te prendes\n"
                + "fuego, te das una patada en el culo. Y luego te pavoneas.\n"
                + "Anarquistas: Un culto idealista a la personalidad\n"
                + "que a veces tiene éxito a pesar de sí mismo.\n"
                + "modo, pueden captar miembros de las poblaciones locales. El pelo rojo se considera una marca del favor de Set.");
        Toreador.setApariencia("Prácticamente todos son\n"
                + "atractivos de alguna manera, ya sea la belleza\n"
                + "tradicional de una modelo de pasarela o la\n"
                + "peligrosa atracción de algo más predatorio. Los Degenerados aumentan su\n"
                + "belleza física con un gran sentido\n"
                + "del estilo personal, que puede tomar la forma de carísima alta costura, ropa de calle vanguardista\n"
                + "o moda clásica diseñada para\n"
                + "resaltar sus seductoras cualidades. Esto no quiere decir que\n"
                + "no existan Toreador feos. De\n"
                + "hecho, aquéllos dotados de menor belleza física a menudo son\n"
                + "quienes van más allá en su elección de indumentaria.");
        Tremere.setApariencia(" Los Tremere\n"
                + "normalmente se presentan de\n"
                + "una de estas dos maneras:\n"
                + "un aspecto público tradicional y severo, o un semblante\n"
                + "mucho más arcano y apropiado\n"
                + "para ejercer sus hechicerías de\n"
                + "Sangre. Cuando están en\n"
                + "público o en eventos de\n"
                + "la Estirpe, los Tremere\n"
                + "optan por trajes y vestidos conservadores y tonos\n"
                + "neutros. Dentro de sus\n"
                + "Capillas o reunidos con\n"
                + "otros del Clan,\n"
                + "a menudo\n"
                + "prefieren\n"
                + "togas\n"
                + "decoradas con sutiles símbolos ocultistas\n"
                + "o atuendos con diversos\n"
                + "pliegues y bolsillos para\n"
                + "los extraños ingredientes de sus rituales.");
        Tzimisce.setApariencia(" Dada su habilidad para manipular su apariencia física mediante la Vicisitud, los Tzimisce tienen el\n"
                + "aspecto que desean, y a menudo buscan provocar o asustar.\n"
                + "Algunos prefieren modificar y experimentar de forma extrema con sus cuerpos hasta parecer sólo vagamente humanos.\n"
                + "Otros buscan redefinir o trascender los límites de sus formas, reconstruyéndose a imagen de ángeles, monstruos,\n"
                + "pesadillas y cosas aún menos\n"
                + "reconocibles.");
        Ventrue.setApariencia(" Los Ventrue prefieren las ropas\n"
                + "conservadoras y un aspecto discreto a no\n"
                + "ser que quieran hacer ostentación de\n"
                + "poder o dinero. Los Príncipes\n"
                + "Ventrue pueden llevar una\n"
                + "corona o portar un cetro\n"
                + "como símbolo de su posición, mientras que los jó-\n"
                + "venes Sangre Azul muestran\n"
                + "sus propios logros vía trajes,\n"
                + "corbatas, vestidos y accesorios\n"
                + "que fácilmente pasan desapercibidos por sí solos pero que se\n"
                + "suman a una apariencia imponente. Si un Ventrue tiene aunque sea un pelo fuera de sitio, es\n"
                + "porque ha pasado toda la noche\n"
                + "persiguiendo a la Sociedad de\n"
                + "Leopoldo y exigiendo la retirada de la amenaza del Sabbat.");

        Malkavian.setRefugio(" La coherencia es rara entre los Malkavian.\n"
                + "Para ser simples, establecen sus refugios donde creen\n"
                + "conveniente, donde pueden y donde son capaces de recordar. Un número significativo de ellos literalmente\n"
                + "no tienen hogar, pasando cada noche donde les permite\n"
                + "el cansancio o los rayos del Sol. Otros pueden ocupar\n"
                + "permanentemente la suite presidencial en un elegante\n"
                + "hotel, un piso okupado en los Yermos, el dispensario de la\n"
                + "prisión del condado o un cuarto de limpieza en un lugar\n"
                + "histórico emblemático.");
        Nosferatu.setRefugio(" Los Vástagos Nosferatu a menudo tienen sus\n"
                + "refugios lejos del desdén y el desprecio del resto de los vampiros. Tanto si construyen sus madrigueras en las alcantarillas que sugiere su apodo como si esculpen un vasto nido de pesadilla en lo alto del campanario de una iglesia en ruinas,\n"
                + "las Ratas de Alcantarilla valoran el secretismo y prefieren\n"
                + "estar en su refugios lejos de sus enemigos. Los Nosferatu de\n"
                + "comportamiento más humilde pueden ocultarse en un edificio abandonado en un callejón poco transitado. Mientras\n"
                + "esté lejos de los demás Vástagos, es un buen refugio.");
        Ravnos.setRefugio("Muchos Ravnos toman\n"
                + "la carretera en lugar de establecerse\n"
                + "en refugios permanentes, viviendo\n"
                + "temporalmente entre comunidades\n"
                + "itinerantes, en moteles de carretera o incluso en vehículos. Cuando\n"
                + "un Embustero echa raíces en un\n"
                + "dominio, su refugio permanente a\n"
                + "menudo está lejos de los territorios\n"
                + "de los Vástagos de las altas esferas.\n"
                + "Los refugios en guetos étnicos, suburbios industriales y lugares aislados son los más seguros y los que con\n"
                + "más frecuencia utilizan los Ravnos");
        Seguidores_de_Set.setRefugio(" Los Setitas establecen sus refugios, ya sean\n"
                + "individuales o comunales, allá donde estén sus templos\n"
                + "ocultos. Estos refugios pueden ser cualquier cosa desde\n"
                + "“iglesias” con denominaciones nunca antes oídas hasta\n"
                + "auténticos cultos que deben enmascarar su existencia. Las\n"
                + "sigilosas Serpientes a veces esconden refugios individuales en lugares donde otros Vástagos no suelen ir, como\n"
                + "aislados guetos étnicos, dominios abandonados, “la parte\n"
                + "mala de la ciudad” y lugares por el estilo. Algunos Setitas\n"
                + "también tienen refugios en lugares místicos secretos que\n"
                + "tienen valor para el Clan, ocultándolos de los extraños");
        Toreador.setRefugio(" Muchos Toreador provienen de la alta sociedad o de trasfondos “bohemios”. De hecho, muchos\n"
                + "son artistas, tienen influencia en la escena artística local\n"
                + "o en otras subculturas. Actores, cantantes, músicos, escultores, poetas, dramaturgos, escritores y personas creativas de cualquier clase pueden encontrar un hogar en\n"
                + "el Clan, así como aquéllos que sirven como mecenas (o\n"
                + "viajan como séquito) de estos artistas");
        Tremere.setRefugio(": Muchos Tremere dependen de una Capilla central que el Clan mantiene en ciudades en las que tiene una\n"
                + "presencia notable. Los Brujos más solitarios poseen refugios\n"
                + "privados, con todos los adornos que uno podría esperar de\n"
                + "un erudito de lo oculto, desde bibliotecas hasta laboratorios\n"
                + "alquímicos u observatorios en terrazas iluminadas por la luz\n"
                + "de la Luna e incluso siniestras mazmorras donde “sujetos de\n"
                + "estudio” viviseccionados se desangran siguiendo los experimentales estímulos controlados por el Tremere");
        Tzimisce.setRefugio(": Los\n"
                + "jóvenes\n"
                + "Tzimisce a\n"
                + "menudo\n"
                + "son Sacerdotes o\n"
                + "Ducti del\n"
                + "Sabbat, y\n"
                + "prefieren\n"
                + "mantener\n"
                + "Refugios\n"
                + "Comunales con sus manadas. Animan a sus compañeros a vivir en lugares aterradores, como bajo un hospital o morgue, o en\n"
                + "los fríos y húmedos escondrijos de un mausoleo. A veces,\n"
                + "los Antiguos del Clan tienen posesiones ancestrales en el\n"
                + "Viejo Mundo, y la imagen del vampiro en el castillo en\n"
                + "ruinas sobre una montaña escarpada debe mucho a los se-\n"
                + "ñores Tzimisce. Estas antiguas propiedades rara vez poseen\n"
                + "comodidades modernas, pero sus señores son extrañamente hospitalarios con los invitados (y terriblemente intolerantes con las molestias no invitadas).");
        Ventrue.setRefugio("El refugio de un Ventrue muestra tanto su gran poder\n"
                + "(léase: riqueza) como sus gustos\n"
                + "distinguidos. Opulento, grandioso,\n"
                + "incluso barroco: todo esto puede\n"
                + "aplicarse a un refugio Ventrue.\n"
                + "Huyen de lo ordinario que muestran otros Vástagos, y su estilo tiende menos a lo vanguardista que a lo\n"
                + "clásico y tradicional. Para los SanVAMPIRO LA MASCARADA EDICIÓN 20º ANIVERSARIO 73\n"
                + "Cita: No hay nada vergonzoso en hincar la rodilla ante alguien como yo,\n"
                + "así que paga tu puto tributo antes de que se me agote la paciencia.\n"
                + "gre Azul, un refugio bien mantenido es una extensión de\n"
                + "uno mismo, y para algunos cualquier cosa que no sea un\n"
                + "refugio en un estado impecable implica debilidad, distracción o incluso locura.");

        Malkavian.setCreacion("La coherencia es rara entre los Malkavian.\n"
                + "Para ser simples, establecen sus refugios donde creen\n"
                + "conveniente, donde pueden y donde son capaces de recordar. Un número significativo de ellos literalmente\n"
                + "no tienen hogar, pasando cada noche donde les permite\n"
                + "el cansancio o los rayos del Sol. Otros pueden ocupar\n"
                + "permanentemente la suite presidencial en un elegante\n"
                + "hotel, un piso okupado en los Yermos, el dispensario de la\n"
                + "prisión del condado o un cuarto de limpieza en un lugar\n"
                + "histórico emblemático.");
        Nosferatu.setCreacion(": Los Vástagos Nosferatu a menudo tienen sus\n"
                + "refugios lejos del desdén y el desprecio del resto de los vampiros. Tanto si construyen sus madrigueras en las alcantarillas que sugiere su apodo como si esculpen un vasto nido de pesadilla en lo alto del campanario de una iglesia en ruinas,\n"
                + "las Ratas de Alcantarilla valoran el secretismo y prefieren\n"
                + "estar en su refugios lejos de sus enemigos. Los Nosferatu de\n"
                + "comportamiento más humilde pueden ocultarse en un edificio abandonado en un callejón poco transitado. Mientras\n"
                + "esté lejos de los demás Vástagos, es un buen refugio");
        Ravnos.setCreacion(" Muchos Ravnos toman\n"
                + "la carretera en lugar de establecerse\n"
                + "en refugios permanentes, viviendo\n"
                + "temporalmente entre comunidades\n"
                + "itinerantes, en moteles de carretera o incluso en vehículos. Cuando\n"
                + "un Embustero echa raíces en un\n"
                + "dominio, su refugio permanente a\n"
                + "menudo está lejos de los territorios\n"
                + "de los Vástagos de las altas esferas.\n"
                + "Los refugios en guetos étnicos, suburbios industriales y lugares aislados son los más seguros y los que con\n"
                + "más frecuencia utilizan los Ravnos");
        Seguidores_de_Set.setCreacion("Los Sires escogen a quienes\n"
                + "demuestran pericia en Atributos Sociales y Mentales, ya\n"
                + "que el Clan necesita que sus proselitistas y sacerdotes sean\n"
                + "carismáticos y astutos. Los Conocimientos casi siempre\n"
                + "son primarios, aunque los Talentos también pueden serlo, especialmente entre aquellas Serpientes que suelan\n"
                + "hacer negocios. Los Setitas enfocan sus Trasfondos para\n"
                + "que les den influencia sobre otros ya sea sutil o abiertamente, lo que hace que Aliados, Contactos, Influencia,\n"
                + "Recursos y algunas veces Criados sean populares.");
        Toreador.setCreacion(" Los Atributos Sociales casi\n"
                + "siempre son los primarios, habiendo una división entre\n"
                + "Técnicas, Talentos y Conocimientos, dependiendo de\n"
                + "en qué destaque el Toreador. También les encanta cultivar Trasfondos. Aliados, Contactos, Dominio, Mentores, Recursos, Criados, Refugio... todos tienen un gran\n"
                + "valor para ellos. Los Toreador sensatos pueden escoger\n"
                + "desarrollar sus Virtudes, Humanidad, Senda o Fuerza de\n"
                + "Voluntad porque, con una vida de degeneración, frecuentemente deberán atender a la desagradable tarea de\n"
                + "mantener a la Bestia a raya");
        Tremere.setCreacion(" Los Atributos Mentales y los\n"
                + "Conocimientos son los que destacan entre los Tremere.\n"
                + "Muchos tienen un alto Coraje y Fuerza de Voluntad, pero\n"
                + "de alguna manera carecen de Conciencia o Convicción.\n"
                + "Suelen preferir los Trasfondos que mejoran su relación\n"
                + "con el Clan, como Mentor, Estatus y Criados (que un\n"
                + "Brujo hábil puede crear a partir de componentes inertes).");
        Tzimisce.setCreacion(" Pocos Tzimisce conocen la\n"
                + "moderación, y de esa manera a menudo prefieren los\n"
                + "Atributos Físicos o los Mentales, teniendo por lo general\n"
                + "uno de los Rasgos extraordinariamente alto. Suelen preferir los Conocimientos, aunque las Técnicas también\n"
                + "son apreciadas. Mentor, Aliados, Dominio y Criados son\n"
                + "bastante apropiados para ellos, así como unas pocas (casi\n"
                + "hiperdesarrolladas) Disciplinas. Sus extrañas mentalidades a menudo los llevan a seguir Sendas de Iluminación.\n"
                + "Las abominaciones a las que la mayoría de los Tzimisce\n"
                + "a menudo se ven expuestos durante sus años como Reto-\n"
                + "ños a veces provocan complicados Trastornos");
        Ventrue.setCreacion("Los Ventrue suelen tener arquetipos de personalidad extrovertidos y controladores. Los\n"
                + "miembros del Clan Ventrue prefieren los Atributos Mentales y Sociales, pero cualquier categoría de Habilidades puede ser la primaria, dependiendo de la experiencia personal.\n"
                + "Los Trasfondos pueden ser o muy variados o elevados entre los Ventrue, y casi todos los Sangre Azul poseen cierta\n"
                + "cantidad de Recursos, Estatus y Rebaño (particularmente\n"
                + "el último, dada la Debilidad del Clan). Los Antiguos en\n"
                + "particular poseen envidiables refugios y amplios Dominios");

        Malkavian.setDebilidad("Todos los miembros del Clan Malkavian\n"
                + "sufren un Trastorno incurable y permanente. Pueden adquirir y recuperarse de cualquier otro Trastorno, y pueden gastar Fuerza de Voluntad para aminorar los efectos\n"
                + "del Trastorno durante una escena, pero nunca pueden\n"
                + "recuperarse por completo de su Trastorno original");
        Nosferatu.setDebilidad("Todos los Nosferatu tienen una puntuación de Apariencia de cero y nunca pueden mejorarla.\n"
                + "Táchala de la hoja de personaje. Las tiradas que utilicen el Rasgo de Apariencia son inherentemente difíciles\n"
                + "para estos horrendos Vástagos");
        Ravnos.setDebilidad("Una historia turbulenta hace a los\n"
                + "Ravnos esclavos de sus vicios. Cada Ravnos siente inclinación por un tipo de vicio (por ejemplo, la mentira,\n"
                + "la crueldad o el robo). Cuando se le presenta la oportunidad de caer en ese vicio, el Ravnos debe satisfacerlo a\n"
                + "menos que su jugador supere una tirada de Autocontrol\n"
                + "o Instinto (dificultad 6).");
        Seguidores_de_Set.setDebilidad(" Dados sus orígenes en la oscuridad, las Serpientes reaccionan negativamente a la luz brillante: añade\n"
                + "dos niveles al daño causado por la exposición a la luz solar.\n"
                + "Los Setitas también pierden un dado de sus reservas para\n"
                + "las acciones que realicen bajo luces brillantes (luces de policía, iluminación de escenarios, bengalas, etc).");
        Toreador.setDebilidad("Cuando un Toreador experimenta algo\n"
                + "realmente extraordinario (una persona, un objet d’art,\n"
                + "un bello amanecer), el jugador debe hacer una tirada\n"
                + "de Autocontrol o Instinto (dificultad 6). El fallo significa que el Vástago se ve cautivado por la experiencia.\n"
                + "El fascinado Toreador no podrá actuar durante el resto\n"
                + "de la escena excepto para comentar o continuar inmerso\n"
                + "en lo que sea que haya captado su atención. Si la experiencia deja de afectarlo (ya sea por haberse desplazado o\n"
                + "por haber resultado destruida, o cualquier otra cosa que\n"
                + "sea apropiada en la situación), la fascinación termina.\n"
                + "Los Toreador embelesados no pueden defenderse si los\n"
                + "atacan, aunque si los hieren pueden volver a hacer una\n"
                + "tirada de Autocontrol o Instinto");
        Tremere.setDebilidad("La dependencia de Sangre de los Tremere es incluso más pronunciada que la de otros Vástagos.\n"
                + "Sólo son necesarios dos tragos de la Sangre de otro vampiro para que un Tremere quede Vinculado en lugar de\n"
                + "los tres normales: la primera vez cuenta como si el Tremere hubiera bebido dos veces (Para más información\n"
                + "acerca del Vínculo de Sangre, ver pág. 299). Los Antiguos del Clan son muy conscientes de esto y buscan imponer lealtad en el Clan forzando a los Brujos Neonatos\n"
                + "a beber la Sangre (transustanciada) de los siete Antiguos\n"
                + "Tremere poco después de su Abrazo");
        Tzimisce.setDebilidad(" Los Tzimisce están inextricablemente\n"
                + "unidos a sus dominios de origen, y deben descansar en la\n"
                + "proximidad de al menos dos puñados de “tierra nativa”\n"
                + "(tierra de un lugar importante para él como mortal, como\n"
                + "el lugar donde nació o el cementerio donde fue Abrazado). Cada noche que pase sin esta conexión física con\n"
                + "su tierra reduce todas las reservas de dados a la mitad, de\n"
                + "forma acumulativa, hasta que sólo le quede un dado en la\n"
                + "reserva. La penalización permanece hasta que descanse\n"
                + "un día completo rodeado de su tierra una vez más");
        Ventrue.setDebilidad(" Los Ventrue tienen gustos refinados, y sólo\n"
                + "un tipo específico de sangre mortal les resulta aceptable y\n"
                + "necesaria. Cuando un jugador crea un personaje Ventrue,\n"
                + "debe decidir con el Narrador qué tipo específico de sangre\n"
                + "alimenta al personaje, y esta elección es permanente. La\n"
                + "sangre de otros tipos (incluso de animales) sencillamente\n"
                + "no aumenta su reserva de Sangre, independientemente de\n"
                + "cuánta consuma: la vomita sin más. Este refinado paladar\n"
                + "puede ser muy amplio o muy restrictivo; por ejemplo, la\n"
                + "sangre de hermanas menores, o la sangre de niños desnudos. La Sangre vampírica está exenta de esta restricción.");

        Malkavian.setOrganizacion("Hay más rumores que verdad en lo que\n"
                + "concierne a la organización de los Malkavian, y circulan\n"
                + "todo tipo de historias horribles que describen el funcionamiento del Clan. Unos dicen que todos los Lunáticos\n"
                + "comparten una mente de colmena; otros proclaman que\n"
                + "de hecho es la persistente consciencia del progenitor del\n"
                + "Clan, Malkav. Incluso algunos dicen que una red de locura pone a todos los Malkavian en contacto entre ellos y\n"
                + "que es la causa de su incapacitante demencia. Por encima\n"
                + "de todo, los Malkavian demuestran ser inescrutables e inesperados. Una noche, todos ellos caen en Frenesí al verse\n"
                + "unos a otros, mientras que a la siguiente todos convergen\n"
                + "a la vez en el refugio del Sheriff y lo acusan de amparar a\n"
                + "espías del Sabbat. ¿Quién sabe cómo se extiende la “enfermedad de la información” o las costumbres del Clan");
        Nosferatu.setOrganizacion(" Ocasionalmente, una coterie de Nosferatu se convierte en una hermandad o en un culto, por lo\n"
                + "general fundadas en torno a una remota madriguera. Estas\n"
                + "coteries pueden extenderse formando vastos “reinos” de\n"
                + "Ratas de Alcantarilla, que normalmente existen sin el conocimiento del Príncipe o Arzobispo de un dominio. Los\n"
                + "Nosferatu están entre los Vástagos que con más frecuencia comparten un refugio comunal, aunque sólo sea por la\n"
                + "protección que confiere el número. Asimismo, los Nosferatu comparten información entre ellos a través de otras\n"
                + "redes (ya sean digitales, personales, ocultas o algo menos\n"
                + "definible) que desafían la comprensión de otros Vástagos.");
        Ravnos.setOrganizacion(" Los Ravnos son un Clan muy diseminado, con poco en común y la clara constatación de que\n"
                + "cada Embustero mira primero por sus propios intereses.\n"
                + "Dicho esto, a los Ravnos les gusta exagerar la camaradería y el ritual cultural del Clan, incluso aunque sepan que\n"
                + "las promesas que se hacen son tan efímeras como los susurros en el viento nocturno. Se sabe que los Embusteros\n"
                + "se han aliado contra enemigos comunes como Príncipes\n"
                + "tiránicos o matanzas del Sabbat, pero estas alianzas se\n"
                + "extinguen rápidamente una vez la amenaza desaparece.");
        Seguidores_de_Set.setOrganizacion("La organización de los Setitas en su\n"
                + "mayoría es local, representando un templo o una red de\n"
                + "cultos la presencia de las Serpientes en la ciudad. Los Setitas en las ciudades raramente hacen planes contra otros\n"
                + "de los suyos, prefiriendo encarar las amenazas externas\n"
                + "en unidad en lugar del cismático egoísmo de las Sectas.\n"
                + "Persisten los rumores acerca de un gigantesco templo dedicado a Set localizado en algún lugar de África, cuyo\n"
                + "líder es un terrible Matusalén que afirma ser Chiquillo\n"
                + "del propio Set. Si esto es cierto, entonces los planes ocultos del Clan probablemente se originen aquí, aunque los\n"
                + "Setitas guardan silencio sobre el tema");
        Toreador.setOrganizacion(": En sus dominios locales, el Clan Toreador es exclusivo y cerrado, pero muy raramente hasta el\n"
                + "punto de afectar a sus costumbres. Ciertos Toreador (y\n"
                + "unos pocos de fuera del Clan) usan el término “Artiste” y\n"
                + "“Poseur” cuando describen a un determinado Toreador, a\n"
                + "menudo burlonamente, para indicar si el Degenerado en\n"
                + "cuestión es considerado como alguien creativo o, simplemente, un seguidor de las tendencias establecidas. En cualquier caso, se trata de una distinción informal");
        Tremere.setOrganizacion("La seña de identidad del Clan Tremere\n"
                + "es “la Pirámide”, la rígida jerarquía que gobierna al Clan\n"
                + "y lo convierte en el más organizado de todos los linajes de\n"
                + "los Vástagos. Con muchos niveles de membresía, facciones\n"
                + "internas y círculos de misterio, la jerarquía de los Tremere\n"
                + "presenta un frente unificado hacia el exterior, y una unidad interna semejante entre bastidores. Aun así, la Pirámide inculca una más que razonable dosis de paranoia, ya que\n"
                + "tanto los Brujos rebeldes como un competitivo ambiente\n"
                + "de ocultismo académico enfrentan a los acólitos unos contra otros en pos de los mayores logros para el Clan.");
        Tzimisce.setOrganizacion("Los Demonios son, en general, desconfiados con el resto de Vástagos, especialmente con los de\n"
                + "su propio Clan. Por ello, la organización de los Tzimisce,\n"
                + "como tal, valora mucho la soledad. Va contra su naturaleza ser sociables, y eso hace que deban esforzarse para ser\n"
                + "Sabbat (aunque esto es menos difícil para los Tzimisce\n"
                + "más jóvenes de actitudes algo más modernas). Ésta es la\n"
                + "razón clave por la que tantos siguen Sendas de Iluminación: para dar propósito a su xenofobia, pero también\n"
                + "para darles un punto de referencia en común con otros\n"
                + "que siguen su misma Senda.");
        Ventrue.setOrganizacion(": La organización del Clan es local y feudal, contando con varios niveles de títulos de nobleza, vasallajes, juramentos de lealtad y de favores que reemplazan a una rígida jerarquía. Muchos Ventrue se presentan\n"
                + "como los amos secretos de sus dominios, consolidando su\n"
                + "poder en duraderas redes y organizando conspiraciones.\n"
                + "Los Ventrue valoran enormemente la propiedad y el honor, y utilizan muchos tratamientos de cortesía y respeto;\n"
                + "sus Leyes del Decoro son complejas y rígidas, y podrían\n"
                + "llenar varios volúmenes. Casi todos los Ventrue dignos\n"
                + "de su posición pueden recitar su linaje al menos hasta sus\n"
                + "Antiguos, si no hasta los grandes Matusalenes.");

        clanes.add(Assamitas);
        clanes.add(Brujah);
        clanes.add(Gangrel);
        clanes.add(Giovanni);
        clanes.add(Lasombra);
        clanes.add(Malkavian);
        clanes.add(Nosferatu);
        clanes.add(Ravnos);
        clanes.add(Seguidores_de_Set);
        clanes.add(Toreador);
        clanes.add(Tremere);
        clanes.add(Tzimisce);
        clanes.add(Ventrue);
        clanes.add(Caitiff);
        return clanes;

    }

    public static ArrayList<Generacion> Generacion_V20() {
        ArrayList<Generacion> gen = new ArrayList<>();
        gen.add(new Generacion("Tercera", 10, 50, 0));
        gen.add(new Generacion("cuarta", 9, 50, 10));
        gen.add(new Generacion("Quinta", 8, 40, 8));
        gen.add(new Generacion("Sexta", 7, 30, 6));
        gen.add(new Generacion("Séptima", 6, 20, 4));
        gen.add(new Generacion("Octaba", 5, 15, 3));
        gen.add(new Generacion("Novenas", 5, 14, 2));
        gen.add(new Generacion("Decima", 5, 13, 1));
        gen.add(new Generacion("Undecima", 5, 12, 1));
        gen.add(new Generacion("Duodecima", 5, 11, 1));
        gen.add(new Generacion("Decimotercera", 5, 10, 1));
        gen.add(new Generacion("Decimo cuarta", 5, 10, 1));
        gen.add(new Generacion("Decima quinta", 5, 10, 1));
        return gen;
    }

    public static ArrayList<Meritos_Defectos> Meritos_F() {
        ArrayList<Meritos_Defectos> fisicos = new ArrayList<>();
        String f = "Fisicos";
        fisicos.add(new Meritos_Defectos(f, "Ambidiestro", "Tienes un alto grado de destreza en la mano torpe y puedes realizar acciones con la mano “mala” sin penalización\n"
                + "alguna. Las reglas para realizar acciones múltiples aún se\n"
                + "aplican, pero no sufres ningún penalizador a la dificultad\n"
                + "si usas dos armas o te ves forzado a utilizar tu mano torpe", 1));
        fisicos.add(new Meritos_Defectos(f, "Cara Amistosa", "Tienes una cara que a todo el mundo le recuerda a\n"
                + "alguien, hasta el punto que los extraños se ven inclinados a tu favor por ello. El efecto no se desvanece incluso\n"
                + "si explicas su “error”, lo que te proporciona un –1 a la\n"
                + "dificultad en todas las tiradas Sociales apropiadas (válido para Seducción, por ejemplo, pero no para Intimidación) cuando hay un extraño. Este Mérito sólo funciona\n"
                + "la primera vez que te encuentras con alguien", 1));
        fisicos.add(new Meritos_Defectos(f, "Comer Comida", "Tienes la capacidad de comer comida e incluso de saborearla. Aunque no puedes obtener alimento de comidas normales, esta habilidad te servirá para fingir que eres\n"
                + "humano. Por supuesto, no puedes digerir lo que comes,\n"
                + "y en algún momento de la noche tendrás que vomitarlo.", 1));
        fisicos.add(new Meritos_Defectos(f, "Equilibrio Felino", "Posees un sentido del equilibrio innato y perfecto. Los\n"
                + "personajes con este Mérito reducen las dificultades de\n"
                + "todas las acciones relacionadas con el equilibrio (por\n"
                + "ejemplo: Destreza + Atletismo para caminar por superficies estrechas) en dos", 1));
        fisicos.add(new Meritos_Defectos(f, "Madrugador", "Nadie puede explicarlo, pero pareces tener la habilidad para continuar en movimiento con menos descanso\n"
                + "que el resto de los vampiros. Siempre pareces ser el primero en levantarse y el último en irse a dormir, incluso\n"
                + "aunque estés despierto hasta después del alba. Se considera que tu puntuación de Humanidad o de Senda es de\n"
                + "10 para el propósito de decidir cuándo te levantas cada\n"
                + "noche. Los vampiros con este Mérito no pueden tener el\n"
                + "Defecto Sueño Profundo", 1));
        fisicos.add(new Meritos_Defectos(f, "Maton", "Tu apariencia de gorila inspira miedo (o al menos inquietud) en aquéllos que te ven. Aunque no tienes que\n"
                + "ser feo por fuerza, irradias una silenciosa amenaza, hasta\n"
                + "el punto en que la gente cruza la calle para evitar pasar cerca de ti. Todas las tiradas de Intimidación contra\n"
                + "aquéllos que no han demostrado su superioridad física\n"
                + "sobre ti, tienen un –1 de dificultad.", 1));
        fisicos.add(new Meritos_Defectos(f, "Sentido Agudo", "Uno de tus sentidos está excepcionalmente desarrollado, ya sea la vista, el oído, el olfato, el tacto o el\n"
                + "gusto. Las dificultades para las acciones que tengan que\n"
                + "ver con ese sentido en particular se reducen en dos.\n"
                + "Este Mérito puede combinarse con la Disciplina Auspex para producir efectos de agudeza sensorial sobrehumana", 1));
        fisicos.add(new Meritos_Defectos(f, "Color Saludable", "Pareces más saludable que el resto de los vampiros,\n"
                + "lo que te permite mezclarte en la sociedad humana\n"
                + "mucho más fácilmente. Aún conservas el color de\n"
                + "un mortal vivo y tu piel sólo está ligeramente fría al\n"
                + "tacto", 2));
        fisicos.add(new Meritos_Defectos(f, "Voz Encantadora", "Hay algo en tu voz que los demás no pueden ignorar.\n"
                + "Cuando das órdenes, los sometes. Cuando seduces, se\n"
                + "quedan embelesados. Ya sea atronadora, relajante, persuasiva o simplemente agradable, tu voz exige atención.\n"
                + "Las dificultades de todas las tiradas que tengan que ver\n"
                + "con el uso de la voz para persuadir, convencer o dar órdenes se reducen en dos", 2));
        fisicos.add(new Meritos_Defectos(f, "Digestion Eficiente", "Puedes conseguir más cantidad de alimento del habitual de la sangre. Cuando te alimentes, ganas un punto\n"
                + "adicional en tu reserva de Sangre por cada dos puntos de\n"
                + "Sangre que consumas. Esto no te permite sobrepasar el\n"
                + "máximo de tu reserva de Sangre.", 3));
        fisicos.add(new Meritos_Defectos(f, "Temerario", "Eres bueno asumiendo riesgos y aún mejor sobreviviendo a ellos. Cuando intentan acciones excepcionalmente\n"
                + "arriesgadas fuera de situaciones de combate (como saltar\n"
                + "de un coche en movimiento a otro), los personajes con\n"
                + "este Mérito añaden tres dados adicionales a sus tiradas e\n"
                + "ignoran un único dado de fracaso del resultado. Generalmente, estas acciones deben tener una dificultad mínima\n"
                + "de 8 y el potencial de infligir al menos tres niveles de\n"
                + "Salud de daño si fallan.", 3));
        fisicos.add(new Meritos_Defectos(f, "Corpulento", "Eres anormalmente grande, al menos dos metros diez\n"
                + "y más de 130 kilos (6’10” y 300 libras). Además de ser\n"
                + "extraordinariamente visible en público, esta masa adicional te concede un nivel de Salud Magullado adicional. Los personajes con este Mérito ganan también bonificaciones para empujar objetos, abrir puertas cerradas,\n"
                + "evitar ser derribados, etc", 4));
        return fisicos;
    }

    public static ArrayList<Meritos_Defectos> Defecto_F() {
        ArrayList<Meritos_Defectos> fisicos = new ArrayList<>();
        String f = "Fisicos";
        fisicos.add(new Meritos_Defectos(f, "Bajo", "Estás bastante por debajo de la altura media, metro y\n"
                + "medio o menos (cuatro pies y medio). Tienes dificultades para alcanzar o manejar objetos diseñados para una\n"
                + "talla de adulto normal, y tu velocidad de carrera es la\n"
                + "mitad de la de alguien de tu edad", 1));
        fisicos.add(new Meritos_Defectos(f, "Duro de oido", "Tu oído es defectuoso. La dificultad de cualquier tirada\n"
                + "que tenga que ver con el sentido del oído aumenta en dos", 1));
        fisicos.add(new Meritos_Defectos(f, "Olor de la tumba", "Exudas un olor a humedad y a tierra removida que\n"
                + "ninguna cantidad de perfume puede cubrir. Los mortales\n"
                + "en tu presencia inmediata se sienten incómodos, así que\n"
                + "todas las dificultades para las tiradas Sociales para afectar\n"
                + "a mortales aumentan en uno", 1));
        fisicos.add(new Meritos_Defectos(f, "Tic", "Haces algún tipo de movimiento repetitivo en momentos de estrés, que supone una seña identificativa.\n"
                + "Una tos nerviosa, frotar las manos continuamente, crujir los nudillos, son ejemplos de estos tics. Te cuesta un\n"
                + "punto de Fuerza de Voluntad evitar caer en tu tic.", 1));
        fisicos.add(new Meritos_Defectos(f, "Defecto Visual", "Tu vista es defectuosa. Las dificultades para cualquier\n"
                + "tirada que tenga que ver con la vista se incrementan en\n"
                + "dos. Con el Defecto de un punto, la condición puede\n"
                + "corregirse usando gafas o lentillas; con la versión de tres\n"
                + "puntos del Defecto, la condición es demasiado severa\n"
                + "como para corregirse", 1));

        fisicos.add(new Meritos_Defectos(f, "Defecto Visual", "Tu vista es defectuosa. Las dificultades para cualquier\n"
                + "tirada que tenga que ver con la vista se incrementan en\n"
                + "dos. Con el Defecto de un punto, la condición puede\n"
                + "corregirse usando gafas o lentillas; con la versión de tres\n"
                + "puntos del Defecto, la condición es demasiado severa\n"
                + "como para corregirse", 3));
        fisicos.add(new Meritos_Defectos(f, "Desfigurado", "Una horrible deformidad hace que tu apariencia sea\n"
                + "incómoda y memorable. Las dificultades de todas las tiradas que tengan que ver con las interacciones sociales\n"
                + "aumentan en dos. No puedes tener una puntuación de\n"
                + "Apariencia mayor de dos.", 2));
        fisicos.add(new Meritos_Defectos(f, "Decimocuarta Generación", "Fuiste creado hace cuatro o cinco años por un miembro\n"
                + "de la Decimotercera Generación. Aunque tienes 10 puntos de Sangre en tu cuerpo, sólo puedes usar ocho de ellos\n"
                + "para curarte, potenciar Disciplinas, aumentar Atributos,\n"
                + "etc. Aún puedes usar esos dos puntos finales para otros\n"
                + "propósitos. El coste de puntos de Sangre para levantarse\n"
                + "cada noche, crear y mantener Ghouls, y crear Vínculos\n"
                + "de Sangre es igual que el del resto de vampiros. No puedes\n"
                + "tener ninguna Disciplina por encima de cuatro puntos.\n"
                + "Tomar este Defecto te impide adquirir el Trasfondo\n"
                + "Generación y tampoco puedes empezar con Estatus. Seguramente seas un Caitiff sin Clan, ya que tu Sangre será\n"
                + "demasiado Débil para transmitir características distinguibles de un Clan. La mayor parte de vampiros de Decimocuarta Generación deberían de escoger el Defecto\n"
                + "Sangre Débil", 2));
        fisicos.add(new Meritos_Defectos(f, "Desfigurado", "Una horrible deformidad hace que tu apariencia sea\n"
                + "incómoda y memorable. Las dificultades de todas las tiradas que tengan que ver con las interacciones sociales\n"
                + "aumentan en dos. No puedes tener una puntuación de\n"
                + "Apariencia mayor de dos.", 2));
        fisicos.add(new Meritos_Defectos(f, "Mordisco Débil", "Por alguna razón tus colmillos nunca se desarrollaron\n"
                + "completamente, o puede que ni siquiera se hayan manifestado en absoluto. Cuando te alimentes, necesitas encontrar otra manera de hacer fluir la sangre. Si no tienes\n"
                + "éxito, debes conseguir el doble de éxitos para que tu mordisco penetre en la carne adecuadamente. Muchos Caitiff\n"
                + "y vampiros de Generación alta manifiestan este Defecto.", 2));
        fisicos.add(new Meritos_Defectos(f, "Mordisco Infeccioso", "No puedes cerrar las heridas causadas cuando te alimentes lamiéndolas. De hecho, tu mordisco tiene una\n"
                + "posibilidad de cada cinco de infectarse y causar a la víctima mortal una enfermedad grave. La naturaleza especí-\n"
                + "fica de la infección es decisión del Narrador.", 2));
        fisicos.add(new Meritos_Defectos(f, "Tuerto", "Tienes sólo un ojo, el ojo que te falta es decisión tuya.\n"
                + "Las dificultades de todas las tiradas de Percepción que\n"
                + "tengan que ver con la vista se incrementan en dos, y las\n"
                + "dificultades de todas las tiradas que tengan que ver con la\n"
                + "profundidad de percepción se incrementan en uno (esto\n"
                + "incluye el combate a distancia)", 2));
        fisicos.add(new Meritos_Defectos(f, "Vulnerabilidad a la Plata", "Para ti, la plata es dolorosa y tan mortal como los rayos\n"
                + "del Sol. Sufres heridas agravadas de cualquier arma de\n"
                + "plata (balas, cuchillos, etc), y el mero toque de los objetos de plata te incomoda.", 2));
        fisicos.add(new Meritos_Defectos(f, "Herida Abierta", "Tienes una o más heridas que rehúsan curarse y que\n"
                + "constantemente rezuman Sangre. Esta lenta pérdida te\n"
                + "cuesta un punto de Sangre adicional cada noche (que\n"
                + "se marca justo antes del alba), además de llamar la atención. Si la herida es visible, tienes un +1 de dificultad a\n"
                + "las tiradas Sociales. Por dos puntos, el Defecto es simplemente poco visible y tiene los efectos básicos anteriormente citados; por cuatro puntos, la herida sangrante es\n"
                + "seria o causa una deformidad que incluye los efectos del\n"
                + "Defecto Herida Permanente (más adelante)", 2));
        fisicos.add(new Meritos_Defectos(f, "Herida Abierta", "Tienes una o más heridas que rehúsan curarse y que\n"
                + "constantemente rezuman Sangre. Esta lenta pérdida te\n"
                + "cuesta un punto de Sangre adicional cada noche (que\n"
                + "se marca justo antes del alba), además de llamar la atención. Si la herida es visible, tienes un +1 de dificultad a\n"
                + "las tiradas Sociales. Por dos puntos, el Defecto es simplemente poco visible y tiene los efectos básicos anteriormente citados; por cuatro puntos, la herida sangrante es\n"
                + "seria o causa una deformidad que incluye los efectos del\n"
                + "Defecto Herida Permanente (más adelante)", 4));
        fisicos.add(new Meritos_Defectos(f, "Adicción", "Sufres de adicción a una sustancia que debe estar presente en la sangre que bebes (o entras en Frenesí automáticamente, como en el Defecto Exclusión de Presa).\n"
                + "Puede ser alcohol, nicotina, drogas duras o simplemente\n"
                + "adrenalina. Esta sustancia siempre te perjudica ", 3));
        fisicos.add(new Meritos_Defectos(f, "Cojo", "Tus piernas están dañadas, lo que te impide correr e\n"
                + "incluso caminar fácilmente. Debes caminar con un bastón o puede que con muletas, y tienes una cojera pronunciada al caminar. Tu velocidad al andar es un cuarto\n"
                + "de la de un humano normal, y correr resulta imposible.", 3));
        fisicos.add(new Meritos_Defectos(f, "Colmillos Permanentes", "Tus colmillos no se retraen, lo que hace que resulte\n"
                + "imposible ocultar tu naturaleza. Aunque algunos mortales pueden pensar que has afilado tus dientes o que llevas prótesis, tarde o temprano encontrarás a alguien que\n"
                + "sepa lo que eres realmente. Además, estás limitado a tres\n"
                + "puntos en tu Apariencia", 3));
        fisicos.add(new Meritos_Defectos(f, "Curación Lenta", "Tienes dificultad para curar tus heridas. Se requieren\n"
                + "dos puntos de Sangre para curar un nivel de Salud de daño\n"
                + "contundente o letal, y curas un nivel de Salud de daño\n"
                + "agravado cada cinco días (además del gasto habitual de\n"
                + "cinco puntos de Sangre y uno de Fuerza de Voluntad).", 3));
        fisicos.add(new Meritos_Defectos(f, "Deformidad", "Tienes algún tipo de deformidad (un brazo atrofiado,\n"
                + "una joroba o un pie zambo, por ejemplo) que te afecta en tus habilidades físicas e interacciones con otros.\n"
                + "Una joroba, por ejemplo, disminuiría la Destreza en dos\n"
                + "y aumentaría la dificultad de las tiradas sociales en uno.\n"
                + "Es responsabilidad del Narrador determinar los efectos\n"
                + "específicos de la deformidad escogida.", 3));
        fisicos.add(new Meritos_Defectos(f, "Herida Permanente", "Sufriste heridas durante el Abrazo que tu transformación no consiguió reparar. Al principio de cada noche,\n"
                + "te alzas del sueño en el nivel de Salud Herido, aunque\n"
                + "puede sanarse gastando puntos de Sangre.", 3));
        fisicos.add(new Meritos_Defectos(f, "Monstruoso", "Tu forma física se dañó durante el Abrazo y ahora refleja la Bestia que ruge dentro de ti. Los personajes con\n"
                + "este Defecto parecen monstruos salvajes y tienen Apariencia cero. Los Nosferatu y otras Líneas de Sangre cuya Debilidad les cause empezar con Apariencia cero no\n"
                + "pueden escoger este Defecto", 3));
        fisicos.add(new Meritos_Defectos(f, "niño", "Eras un niño pequeño (entre cinco y diez años) cuando te Abrazaron, lo que dejó tus Atributos Físicos subdesarrollados y te dificulta a la hora de interactuar con\n"
                + "determinados aspectos de la sociedad mortal. No puedes\n"
                + "tener más de dos puntos en Fuerza o Resistencia durante\n"
                + "la creación de personaje, excepto cuando aumentes los\n"
                + "Atributos Físicos con puntos de Sangre, y las dificultades\n"
                + "de todas las tiradas de dados para tratar de dirigir o dar órdenes a adultos mortales aumentan en dos. Los personajes\n"
                + "con este Defecto deberían tener el Defecto Bajo también", 3));
        fisicos.add(new Meritos_Defectos(f, "Ojos Brillante", "Tienes los estereotípicos ojos brillantes de los vampiros de las leyendas, lo que te da un –1 de dificultad en\n"
                + "las tiradas de Intimidación cuando trates con mortales.\n"
                + "Sin embargo, las desventajas son muchas; debes esconder constantemente esa condición (no, las lentillas no la\n"
                + "ocultan); el brillo entorpece tu visión y te da un +1 a la\n"
                + "dificultad en todas las tiradas que tengan que ver con la\n"
                + "vista (incluyendo armas a distancia); y el brillo que emana de tus ojos hace difícil que te ocultes en la oscuridad\n"
                + "(+2 a la dificultad de las tiradas de Sigilo)", 3));
        fisicos.add(new Meritos_Defectos(f, "Perezoso", "Simplemente eres vago, evitas todo lo que requiera un\n"
                + "esfuerzo por tu parte. Prefieres que otros hagan el trabajo\n"
                + "duro y simplemente pasas el rato. Para cualquier acción\n"
                + "que requiera preparación, existe una gran probabilidad\n"
                + "de que no lo hayas hecho adecuadamente. La dificultad\n"
                + "de las tiradas para acciones Físicas espontáneas (lo que\n"
                + "incluye el combate a no ser que sea parte de una ofensiva\n"
                + "planeada) se incrementa en uno", 3));
        fisicos.add(new Meritos_Defectos(f, "Decimoquinta Generación", "Tu Vitae es tan Débil que sólo puedes utilizar 6 de los\n"
                + "10 puntos de tu reserva de Sangre para usar Disciplinas,\n"
                + "curarte o aumentar Atributos. Para estas funciones, debes gastar dos puntos de Sangre para obtener los mismos\n"
                + "resultados que un vampiro normal obtendría gastando\n"
                + "sólo uno (el coste para levantarse cada noche permanece en un punto de Sangre). Es más, no puedes crear ni\n"
                + "mantener Ghouls, crear Vínculos de Sangre o engendrar\n"
                + "Chiquillos vampíricos. Puedes utilizar el resto de tus\n"
                + "puntos de Sangre para sobrevivir durante el día y levantarte cada noche, nada más.\n"
                + "No puedes subir ninguna Disciplina por encima de tres\n"
                + "puntos. El debilitamiento de la Maldición de Caín tiene sus\n"
                + "beneficios a pesar de todo (lo que distingue este Defecto\n"
                + "del de Sangre Débil). La luz del Sol causa daño letal, en\n"
                + "lugar de daño agravado como lo hace al resto de vampiros. Puedes mantener comida y bebida mortal en tu estómago durante aproximadamente una hora; otros vampiros la vomitan inmediatamente (a no ser que tengan\n"
                + "el Mérito Comer Comida). Y lo más extraño de todo,\n"
                + "eventualmente puedes engendrar de la manera normal,\n"
                + "mortal… aunque no será un niño humano normal", 4));
        fisicos.add(new Meritos_Defectos(f, "Mudo", "No puedes hablar. Puedes comunicarte con el Narrador\n"
                + "y describir tus acciones, pero no puedes hablar con los\n"
                + "demás personajes, jugadores o del Narrador, a no ser que\n"
                + "todos los que se comuniquen conozcan la lengua de signos (a través del Mérito Idioma) o escribas lo que dices.", 4));
        fisicos.add(new Meritos_Defectos(f, "Portador de Enfermedad", " Tu Sangre porta una enfermedad altamente contagiosa\n"
                + "y letal. Esta enfermedad puede ser cualquier cosa desde la\n"
                + "rabia al VIH, y los Vástagos que beben tu Sangre tienen\n"
                + "un 10% de probabilidad de convertirse en portadores a\n"
                + "su vez. Debes gastar un punto de Sangre adicional cada\n"
                + "noche al despertar o empezarás a manifestar los síntomas\n"
                + "de la enfermedad (mayor probabilidad de Frenesí por la\n"
                + "rabia, tiradas de absorción reducidas con VIH, etc).", 4));
        fisicos.add(new Meritos_Defectos(f, "Sangre Débil", "Tu Vitae está diluída, y no te mantiene correctamente. Todos los gastos de puntos de Sangre se doblan (por\n"
                + "ejemplo: utilizar Disciplinas relacionadas con la Sangre,\n"
                + "curar daño), aunque sólo pierdes un punto de Sangre al\n"
                + "alzarte cada noche. Además, no puedes crear Vínculos\n"
                + "de Sangre, y sólo tienes éxito una vez de cada cinco al\n"
                + "tratar de engendrar Progenie.", 4));
        fisicos.add(new Meritos_Defectos(f, "Sordo", "No puedes oír. Aunque puedes ser más resistente a algunas aplicaciones de Dominación, no puedes escuchar\n"
                + "medios vocales o electrónicos, y las dificultades de las\n"
                + "tiradas de Percepción se incrementan en tres.", 4));
        fisicos.add(new Meritos_Defectos(f, "Carne Cadavérica", "Tu carne no se regenera completamente cuando recibe\n"
                + "daño. Aunque eres capaz de curarte hasta el punto de recuperar la funcionalidad plena, tu piel mantiene los cortes, arañazos, agujeros de bala y otros daños visibles que\n"
                + "haya sufrido. Dependiendo de la naturaleza del daño,\n"
                + "este Defecto hará que las acciones sociales sean difíciles\n"
                + "en extremo y puede hacer descender la puntuación de\n"
                + "Apariencia con el tiempo (incluso hasta 0)", 5));
        fisicos.add(new Meritos_Defectos(f, "Vitae Estéril", "Durante tu Abrazo algo fue horriblemente mal, lo que\n"
                + "causó que tu Sangre mutara debido al estrés de morir\n"
                + "y alzarte de nuevo. Todos aquellos a quienes tratas de\n"
                + "Abrazar mueren. No importa lo que hagas, no puedes\n"
                + "engendrar Progenie. Sin embargo, tu Sangre aún puede\n"
                + "utilizarse en rituales de Sangre como la Taumaturgia o\n"
                + "la Vaulderie, o en cualquier otra necesidad vampírica\n"
                + "como crear Ghouls", 5));
        fisicos.add(new Meritos_Defectos(f, "Ciego", "No puedes ver. Los personajes pueden compensar la\n"
                + "pérdida de visión al hacerse más sensibles a otros estímulos sensoriales, pero las pistas e imágenes visuales son inaccesibles para ellos. La dificultad de todas las tiradas de\n"
                + "Destreza aumentan en dos. Extrañamente, los vampiros\n"
                + "con Percepción del Aura (Auspex 2) aún pueden utilizar\n"
                + "esa habilidad, aunque la información se interpreta por\n"
                + "medio de otros sentidos. Por otro parte, los vampiros que\n"
                + "necesitan mantener contacto visual para utilizar Poderes tales como Dominación sufren una penalización para\n"
                + "usarlos contra ti ", 6));

        return fisicos;
    }

    public static ArrayList<Meritos_Defectos> Meritos_M() {
        ArrayList<Meritos_Defectos> mental = new ArrayList<>();
        String f = "Mentales";

        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));

        return mental;
    }

    public static ArrayList<Meritos_Defectos> Defecto_M() {
        ArrayList<Meritos_Defectos> mental = new ArrayList<>();
        String f = "Mentales";

        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));

        return mental;
    }

    public static ArrayList<Meritos_Defectos> Meritos_S() {
        ArrayList<Meritos_Defectos> mental = new ArrayList<>();
        String f = "Sociales";

        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        return mental;
    }

    public static ArrayList<Meritos_Defectos> Defecto_S() {
        ArrayList<Meritos_Defectos> mental = new ArrayList<>();
        String f = "Sociales";

        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        return mental;
    }

    public static ArrayList<Meritos_Defectos> Meritos_SobreN() {
        ArrayList<Meritos_Defectos> mental = new ArrayList<>();
        String f = "Sobrenaturales";

        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        return mental;
    }

    public static ArrayList<Meritos_Defectos> Defecto_SobreN() {
        ArrayList<Meritos_Defectos> mental = new ArrayList<>();
        String f = "Sobrenaturales";

        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        mental.add(new Meritos_Defectos(f, "", "", 0));
        return mental;
    }

    public static ArrayList<Trasfondo> Trasfondos_v20() {
        ArrayList<Trasfondo> Trasfondos = new ArrayList<>();
        Trasfondos.add(new Trasfondo(0, "Aliados", "Los Aliados son mortales que te apoyan y ayudan: familiares, amigos o incluso una organización mortal que\n"
                + "te debe lealtad. Aunque te ayuden voluntariamente, sin\n"
                + "coacción o coerción, no están siempre disponibles para\n"
                + "ofrecer asistencia; tienen sus propias preocupaciones y\n"
                + "hacen cuanto pueden por el bien de vuestra relación.\n"
                + "Sin embargo, podrían tener Rasgos de Trasfondos útiles\n"
                + "propios, y podrían proveerte con acceso indirecto a sus\n"
                + "Contactos, Influencia o Recursos.\n"
                + "Los Aliados son a menudo personas influyentes y con\n"
                + "poder en tu ciudad natal. Pueden ser de casi cualquier\n"
                + "clase dependiendo de lo que tu Narrador permita. Puedes\n"
                + "tener amigos en el depósito de cadáveres de la policía, en\n"
                + "un blog destacado, entre la alta sociedad de celebridades\n"
                + "locales o en una obra. Tus Aliados podrían ser un clan de\n"
                + "nómadas que trasladan su hogar móvil por la zona o una\n"
                + "familia con generaciones y generaciones de policías. Podrías contar incluso al mismísimo alcalde entre tus amigos dependiendo de cuántos puntos gastes en este Rasgo.\n"
                + "Tus Aliados son generalmente de fiar (aunque probablemente no sepan que eres un vampiro, o que siquiera\n"
                + "existan). Sin embargo, nada es gratis. Si acabas pidiendo\n"
                + "favores de tu amigo en la Cosa Nostra, es probable que\n"
                + "igualmente te pida que le hagas un favor en el futuro.\n"
                + "Esto casi siempre provoca el inicio de una historia...\n"
                + "Aliados puede ser Compartido por una coterie de personajes.\n"
                + "• Un aliado de influencia y poder moderados.\n"
                + "•• Dos aliados, ambos de poder moderado.\n"
                + "••• Tres aliados, uno de los cuales es bastante influyente.\n"
                + "•••• Cuatro aliados, uno de los cuales es\n"
                + "muy influyente.\n"
                + "••••• Cinco aliados, uno de los cuales es\n"
                + "extremadamente influyente"));
        Trasfondos.add(new Trasfondo(0, "Contactos", "Conoces a gente por toda la ciudad. Cuando empiezas a hacer llamadas a través de tu red, la cantidad de\n"
                + "información que puedes obtener es impresionante. Más\n"
                + "que amigos a los que puedes requerir ayuda, como los\n"
                + "Aliados, los Contactos son sobre todo gente a la que\n"
                + "pagas, manipulas o coaccionas para que te ofrezcan información. Puedes también tener unos pocos contactos\n"
                + "principales, asociados que te dan información precisa\n"
                + "dentro de sus ámbitos de conocimiento. Deberías describir cada contacto principal en detalle antes de comenzar a jugar.\n"
                + "Además de tus contactos principales, también puedes\n"
                + "tener un número de contactos menores desplegados por\n"
                + "toda la ciudad. Tu contacto principal podría estar en la\n"
                + "oficina del fiscal del distrito, mientras los menos importantes podrían incluir policías quemados, empleados de\n"
                + "tráfico, porteros de discoteca o miembros de una red social en Internet. No necesitas detallar estos “conocidos\n"
                + "fugaces” antes de jugar. En vez de eso, para contactar satisfactoriamente con un contacto menor, tirarías tu puntuación de Contactos (dificultad 7). Puedes hacer uso\n"
                + "de un contacto menor por cada éxito. Por supuesto, aún\n"
                + "tienes que convencerlos para que te den la información\n"
                + "que necesites, asumiendo que la tengan.\n"
                + "Contactos puede ser Compartido entre los personajes\n"
                + "de una coterie.\n"
                + "• Un contacto principal.\n"
                + "•• Dos contactos principales.\n"
                + "••• Tres contactos principales.\n"
                + "•••• Cuatro contactos principales.\n"
                + "••••• Cinco contactos principales."));
        Trasfondos.add(new Trasfondo(0, "Criados", "Sin ser precisamente Aliados o Contactos, tus Criados\n"
                + "son sirvientes, asistentes u otras personas que sean tus\n"
                + "constantes y leales ayudantes. Muchos siervos de vampiros son Ghouls (ver pág. 496): sus Poderes sobrenaturales\n"
                + "y su lealtad forzada por el Vínculo de Sangre los convierten en los sirvientes preferidos por ellos. También\n"
                + "podrían ser personas a quienes hayas Dominado repetidamente hasta que no les queda voluntad alguna o seguidores tan fascinados con tu Presencia que su lealtad raya\n"
                + "en el fanatismo ciego. Algunos vampiros, especialmente\n"
                + "aquéllos con la Disciplina Animalismo, emplean animales Ghouls como Criados.\n"
                + "Debes mantener algún control sobre tus criados; ya sea\n"
                + "mediante un salario, el don de tu Vitae o el uso de Disciplinas. Los criados nunca son “ciegamente leales pase lo\n"
                + "que pase”: si los tratas mal sin ejercer un control estricto,\n"
                + "podrían volverse contra ti.\n"
                + "Los Criados pueden ser útiles, pero nunca perfectos.\n"
                + "Un Ghoul físicamente potente podría ser rebelde, inconvenientemente torpe o carente de capacidades prácticas. Un mayordomo leal podría ser físicamente débil o\n"
                + "carecer de iniciativa o creatividad propias. Este Trasfondo no es una excusa para crear un guardaespaldas imparable o un asesino a modo de mascota: es un método para\n"
                + "incorporar más personajes totalmente desarrollados a la crónica, así como para reflejar a los seguidores por los\n"
                + "que los Vástagos son tristemente célebres. En general,\n"
                + "los criados se parecen más a Renfield que a Anita Blake.\n"
                + "(Si jugador y Narrador están de acuerdo, el primero podría crear un único Criado más competente combinando\n"
                + "más puntos en este Trasfondo, poniendo más huevos en la\n"
                + "misma cesta, como se suele decir).\n"
                + "Los jugadores pueden emplear puntos de Trasfondos\n"
                + "Compartidos en Criados.\n"
                + "• Un criado.\n"
                + "•• Dos criados.\n"
                + "••• Tres criados.\n"
                + "•••• Cuatro criados.\n"
                + "••••• Cinco criados"));
        Trasfondos.add(new Trasfondo(0, "Dominio", "Dominio es un territorio físico (normalmente dentro de la ciudad principal de la crónica) cuyo acceso a\n"
                + "efectos de alimentación controla tu personaje. Algunos\n"
                + "Vástagos se refieren a sus dominios como territorios de\n"
                + "Caza, y la mayoría los protege celosamente, invocando\n"
                + "incluso la Tradición del mismo nombre para defender\n"
                + "sus reclamaciones. Como parte de este Trasfondo, la reclamación del personaje sobre el dominio es reconocida\n"
                + "por el Príncipe o cualquier otra autoridad de los Vástagos\n"
                + "en la ciudad donde se localice.\n"
                + "Los Vástagos que reclaman el dominio no pueden\n"
                + "evitar que los residentes vivos salgan a sus negocios, ni\n"
                + "ejercen ninguna influencia directa sobre ellos, pero pueden observar por sí mismos sus idas y venidas. Pueden\n"
                + "tener Aliados o Criados que vigilen específicamente si\n"
                + "hay vampiros desconocidos y alerten al personaje cuando encuentren a alguno.\n"
                + "Dominio se refiere específicamente a la geografía (en\n"
                + "muchos casos un vecindario o calle) y propiedades allí\n"
                + "presentes, en oposición a la gente que puede habitar allí\n"
                + "(que es en lo que hace hincapié Rebaño). Juega una parte importante en la sociedad de los Vástagos (los vampiros que carecen de un Dominio significativo rara vez\n"
                + "obtienen respeto) pero no da derecho automático a Posición entre los Condenados.\n"
                + "Podrías dedicar uno o más puntos en Dominio para\n"
                + "incrementar la seguridad del territorio de tu personaje\n"
                + "en vez de su tamaño. Cada punto dedicado a seguridad\n"
                + "otorga un penalización de +1 a la dificultad a los esfuerzos de cualquiera que se introduzca en el Dominio sin\n"
                + "permiso expreso, y una mejora de –1 a la dificultad a los\n"
                + "esfuerzos de tu personaje para identificar y rastrear a los\n"
                + "intrusos. Un Dominio de un punto de tamaño y dos de\n"
                + "seguridad, por ejemplo, es pequeño pero bastante resistente al allanamiento, al contrario de un Dominio\n"
                + "de puntuación de tres puntos de tamaño sin seguridad\n"
                + "extraordinaria.\n"
                + "Cada punto de Dominio reduce la dificultad para las\n"
                + "pruebas de Caza en él de tu personaje y de aquéllos a\n"
                + "quienes autorice. También se añade a tu reserva de Sangre inicial (no a la máxima). Si empleas la opción de\n"
                + "seguridad, cada punto empleado aumenta la dificultad\n"
                + "en +1 para vampiros no invitados. Ver pág. 259 para más\n"
                + "información sobre la Caza.\n"
                + "Para Dominio (tanto para tamaño como para seguridad) pueden emplearse puntos de Trasfondo Compartidos.\n"
                + "• Un simple y pequeño edificio, como\n"
                + "un hogar unifamiliar o un establecimiento social, suficiente para un\n"
                + "refugio básico.\n"
                + "•• Una iglesia, fábrica, almacén, bloque\n"
                + "de pisos u otra estructura grande, una\n"
                + "ubicación con un acceso directo pero\n"
                + "fácilmente controlable al mundo exterior.\n"
                + "••• Torre, manzana de casas o una intersección importante, una ubicación o\n"
                + "área que ofrezca zonas para ocultarse\n"
                + "así como un acceso controlado.\n"
                + "•••• Una sección de alcantarillas, una red\n"
                + "de túneles de servicio, un enclave de\n"
                + "hogares en una colina sobre la ciudad,\n"
                + "un lugar con rasgos defensivos inherentes, como una aislada carretera de\n"
                + "montaña, acceso mediante un solo\n"
                + "puente o fuerza de seguridad privada.\n"
                + "••••• Un barrio entero, una subdivisión étnica como “Chinatown” o “Little Italy”,\n"
                + "o todo un suburbio.\n"
                + "Como ya se ha explicado con anterioridad, los personajes de una coterie pueden compartir sus recursos de\n"
                + "Dominio para obtener mejores resultados. De seis a ocho\n"
                + "puntos aseguran toda una ciudad pequeña o una parte\n"
                + "específica de la ciudad como dominio. De 10 a 15 puntos aseguran un sector urbano importante pero no geográficamente extenso, como “los muelles” o “Highland\n"
                + "Park”. Una gran ciudad en sí misma podría costar más de\n"
                + "un centenar de puntos de Dominio, como Atlanta, Dallas, Ginebra o Bagdad. Una ciudad como Nueva York,\n"
                + "Londres, París, Roma, São Paulo o Shanghai requeriría\n"
                + "muchos cientos de puntos de Dominio"));
        Trasfondos.add(new Trasfondo(0, "Estatus", "Tienes algo de reputación y posición (merecida o no)\n"
                + "entre la comunidad local de Vástagos. El Estatus en la\n"
                + "sociedad de la Camarilla suele derivar tanto del de tu\n"
                + "Sire y del respeto que se debe a tu linaje particular como\n"
                + "de tu éxito personal. Entre el Sabbat, es más probable\n"
                + "que derive de la reputación de tu manada o del celo de\n"
                + "tu actitud. Los Antiguos son conocidos por tener poco\n"
                + "respeto por sus jóvenes; este Trasfondo lo puede mitigar\n"
                + "en parte.\n"
                + "Un elevado Estatus en la Camarilla no se aplica en la\n"
                + "sociedad Sabbat (y probablemente te convertirá en un\n"
                + "objetivo importante para los rivales de tu Secta), y viceversa. Igualmente, los Autarcas no suelen tener Estatus,\n"
                + "a menos que hayan acumulado de alguna manera tanto\n"
                + "poder y atención como para ser considerados fuerzas a\n"
                + "tener en cuenta. Puedes tener la posibilidad de hacer una\n"
                + "tirada de Estatus junto con un Rasgo Social para reflejar\n"
                + "los efectos positivos de tu prestigio.\n"
                + "Ten en cuenta que los personajes Caitiff no pueden\n"
                + "adquirir Estatus durante la creación de personaje. Son lo\n"
                + "más bajo de todo, y cualquier respeto que alcancen debe\n"
                + "adquirirse en el transcurso de la crónica.\n"
                + "• Conocido: Un Neonato/Sacerdote de\n"
                + "manada.\n"
                + "•• Respectado: Un Ancilla/Ductus respetado.\n"
                + "••• Influyente: Un Antiguo/Templario.\n"
                + "•••• Poderoso: Un miembro de la Primogenitura/Obispo.\n"
                + "••••• Luminaria: Un Príncipe/Arzobispo."));
        Trasfondos.add(new Trasfondo(0, "Fama", "Gozas de amplio reconocimiento en la sociedad mortal; quizás como artista, escritor o atleta. La gente puede\n"
                + "disfrutar sólo por ser vista contigo. Esto te da toda clase de privilegios al moverte en la sociedad mortal, pero\n"
                + "también atrae mucha atención no deseada ahora que ya\n"
                + "no estás vivo. La mayor arma que ofrece la fama es la capacidad de cambiar la opinión pública, como los medios\n"
                + "de comunicación modernos prueban constantemente.\n"
                + "La Fama no se vincula siempre al entretenimiento: un\n"
                + "perverso criminal inmerso en un gran proceso judicial\n"
                + "probablemente sea bastante famoso, igual que un legislador o un científico que haya hecho un descubrimiento\n"
                + "popular.\n"
                + "Este Trasfondo es obviamente un arma de doble filo.\n"
                + "Ciertamente puedes disfrutar de los privilegios de tu prestigio (conseguir los mejores asientos, ser invitado a\n"
                + "eventos que te perderías de otra manera, citarte con la\n"
                + "élite), pero a veces eres reconocido en momentos en los\n"
                + "que preferirías no serlo. Aún así, tus enemigos no pueden simplemente hacerte desaparecer sin provocar gran\n"
                + "conmoción, y encuentras más fácil Cazar en áreas pobladas ya que la gente acude a ti (reduces las dificultades de\n"
                + "tiradas de Caza en uno por punto en Fama). Además, tu\n"
                + "Narrador podría permitir reducir la dificultad de ciertas\n"
                + "tiradas sociales contra gente particularmente impresionable o fascinada con las celebridades.\n"
                + "• Eres conocido para una subcultura\n"
                + "selecta: fieles a los clubes locales, blogueros del entretenimiento o la gente\n"
                + "de Park Avenue, por ejemplo.\n"
                + "•• Gente al azar empieza a reconocer tu\n"
                + "cara; eres una celebridad menor, como\n"
                + "un criminal de poca monta o un presentador de noticias locales.\n"
                + "••• Tienes mucho renombre; quizás eres\n"
                + "un senador o una artista que regularmente consigue cientos de miles de\n"
                + "clicks en YouTube.\n"
                + "•••• Una celebridad en toda regla; tu nombre es reconocido casi siempre por la\n"
                + "gente común en la calle.\n"
                + "••••• Eres alguien bien conocido por todos.\n"
                + "La gente le pone tu nombre a sus hijos"));
        Trasfondos.add(new Trasfondo(0, "Generación", "Este Trasfondo representa tu Generación: la pureza de\n"
                + "tu Sangre y tu proximidad al Primer Vampiro. Una puntuación alta en Generación puede representar un Sire\n"
                + "poderoso o un gusto decididamente peligroso por la Diablerie. Si no adquieres ningún punto en este Rasgo, comienzas jugando como un vampiro de la Decimotercera\n"
                + "Generación. Ver pág. 270 para más información.\n"
                + "• Duodécima Generación: reserva de\n"
                + "Sangre 11, puedes gastar 1 punto de\n"
                + "Sangre por turno.\n"
                + "•• Undécima Generación: reserva de\n"
                + "Sangre 12, puedes gastar 1 punto de\n"
                + "Sangre por turno.\n"
                + "••• Décima Generación: reserva de Sangre\n"
                + "13, puedes gastar 1 punto de Sangre\n"
                + "por turno.\n"
                + "•••• Novena Generación: reserva de Sangre\n"
                + "14, puedes gastar 2 puntos de Sangre\n"
                + "por turno.\n"
                + "••••• Octava Generación: reserva de Sangre\n"
                + "15, puedes gastar 3 puntos de Sangre\n"
                + "por turno"));
        Trasfondos.add(new Trasfondo(0, "Identidad Alternativa", "Mantienes una identidad alternativa completa, con\n"
                + "papeles, partidas de nacimiento o cualquier otra documentación que desees. Sólo unos pocos pueden saber tu\n"
                + "nombre o identidad real. Tu personalidad alternativa\n"
                + "podría estar muy implicada en el crimen organizado, ser\n"
                + "un miembro de la Secta opuesta, un estafador que usa\n"
                + "identidades alternativas para sus líos o podrías dedicarte\n"
                + "simplemente a reunir información sobre el enemigo. De\n"
                + "hecho, algunos vampiros pueden conocerte como un individuo mientras otros creen que eres alguien totalmente\n"
                + "diferente.\n"
                + "• Eres nuevo en este juego de identidades. A veces te despistas y olvidas tu\n"
                + "otra personalidad.\n"
                + "•• Bien asentado en tu identidad alternativa. Eres tan convincente como para\n"
                + "simular el papel de un doctor, abogado,\n"
                + "agente de pompas fúnebres, traficante\n"
                + "de drogas o un espía capaz.\n"
                + "••• Tienes buena reputación como tu personalidad alternativa y se te reconoce\n"
                + "por ese nombre en el área donde te has\n"
                + "infiltrado.\n"
                + "•••• Tu identidad alternativa se ha ganado\n"
                + "respeto y confianza dentro del área de\n"
                + "infiltración.\n"
                + "••••• Inspiras respeto en tu área de infiltración, y puedes incluso haber acumulado algo de influencia. Tienes la\n"
                + "confianza (o al menos el reconocimiento) de muchos individuos poderosos dentro de tu área."));
        Trasfondos.add(new Trasfondo(0, "Influencia", "Tienes tirón en la comunidad mortal, sea a través de\n"
                + "riqueza, prestigio, cargos políticos, chantaje o manipulación sobrenatural. Los Vástagos con gran Influencia\n"
                + "pueden condicionar, y en raros casos incluso controlar,\n"
                + "los procesos políticos y sociales de la sociedad humana.\n"
                + "Influencia representa la suma de tu poder para manipular\n"
                + "a la opinión pública y la política en tu comunidad, especialmente la policía y la burocracia. En algunos casos,\n"
                + "cultivarla es una vía para generar Recursos (consulta a\n"
                + "continuación). Algunas tiradas pueden requerir que uses Influencia en\n"
                + "vez de una Habilidad, especialmente cuando tratas de\n"
                + "influir en burócratas menores. Es más fácil iniciar cambios radicales a un nivel local que a escala global (por\n"
                + "ejemplo, provocar que un edificio “abandonado” sea demolido es relativamente fácil, mientras que empezar una\n"
                + "guerra es un poco más difícil).\n"
                + "En Influencia pueden emplearse puntos de Trasfondo\n"
                + "Compartido.\n"
                + "• Moderadamente influyente; un factor\n"
                + "en la política local.\n"
                + "•• Bien conectado; una fuerza en políticas\n"
                + "provinciales o estatales.\n"
                + "••• Posición de influencia; un factor en\n"
                + "políticas regionales.\n"
                + "•••• Extenso poder personal; una fuerza en\n"
                + "políticas nacionales.\n"
                + "••••• Enormemente influyente; un factor en\n"
                + "política mundial."));
        Trasfondos.add(new Trasfondo(0, "Mentor", "Este Rasgo representa a un Vástago o grupo de éstos\n"
                + "que cuida de ti, ofreciendo guía o ayuda de vez en cuando. Un Mentor puede ser poderoso, pero su poder no necesita ser directo. Dependiendo del número de puntos\n"
                + "en este Trasfondo, tu mentor podría no ser más que un\n"
                + "vampiro con una notable red de información, o podría\n"
                + "ser una criatura centenaria con tremenda influencia y\n"
                + "poder sobrenatural. Podría ofrecer consejo, hablar al\n"
                + "Príncipe o Arzobispo en tu favor, alejar de ti a otros Antiguos o aconsejarte cuando des con situaciones que no\n"
                + "comprendes.\n"
                + "Casi siempre tu mentor es tu Sire, pero bien podría ser cualquier Cainita con interés en tu bienestar. Una puntuación alta de Mentor podría incluso\n"
                + "representar un grupo de vampiros afines, como los\n"
                + "Antiguos de la Capilla local Tremere o una célula de\n"
                + "la Mano Negra.\n"
                + "Ten en cuenta que este Rasgo no es una tarjeta de\n"
                + "“Sal libre de la Cárcel”. Tu Mentor no llegará necesariamente como la caballería cuando estés en peligro (y\n"
                + "si lo hace, es posible que pierdas un punto o más en este\n"
                + "Trasfondo al incurrir en su ira). Además, ocasionalmente podría esperar algo a cambio de su patrocinio, lo que\n"
                + "puede llevar a numerosas e interesantes historias. Por\n"
                + "lo general, un mentor permanece a distancia, dándote\n"
                + "información o consejos útiles por camaradería, pero te\n"
                + "abandonará sin dudarlo si demuestras ser un protegido\n"
                + "indigno o problemático.\n"
                + "• El Mentor es un Ancilla de poca\n"
                + "influencia o un Ductus o Sacerdote de\n"
                + "manada.\n"
                + "•• El Mentor es respetado: un Antiguo\n"
                + "o un veterano muy condecorado, por\n"
                + "ejemplo.\n"
                + "••• El Mentor es enormemente influyente,\n"
                + "como un miembro de la Primogenitura\n"
                + "o un Obispo.\n"
                + "•••• El Mentor tiene gran cantidad de\n"
                + "poder sobre la ciudad: un Príncipe o\n"
                + "Arzobispo, por ejemplo.\n"
                + "••••• El Mentor es extraordinariamente\n"
                + "poderoso, quizás incluso un Justicar o\n"
                + "Cardenal."));
        Trasfondos.add(new Trasfondo(0, "Mienbro de la mano Negra", "Este Trasfondo sólo está disponible para personajes del Sabbat.\n"
                + "Eres miembro de la temida Mano Negra, la masa de\n"
                + "soldados y asesinos que sirve al Sabbat con fervor. Tener\n"
                + "este Trasfondo indica que eres miembro de pleno derecho de la organización, y tienes todas las responsabilidades y beneficios que acompañan a la membresía.\n"
                + "Puedes pedir ayuda a miembros de la Mano Negra para\n"
                + "que te auxilien si alguna vez lo necesitas. Por supuesto,\n"
                + "esta capacidad se da en ambos sentidos, y otros miembros de la Mano pueden requerir que los ayudes. Por ello,\n"
                + "puedes encontrar que se te asignan asesinatos, que has de\n"
                + "prestar ayuda marcial o incluso promover los objetivos\n"
                + "políticos de la Mano como diplomático o espía. También se te puede requerir que atiendas a cruzadas que te\n"
                + "alejen de tu manada. Todo miembro de la Mano Negra\n"
                + "debe atender la llamada de otro miembro, especialmente\n"
                + "de los superiores de la facción.\n"
                + "Ser un miembro de la Mano Negra es algo prestigioso, y otros miembros del Sabbat respetan la organización. Cuando trates con otros Sabbat, si decidieras\n"
                + "revelar tu afiliación con la Mano, puedes añadir tu\n"
                + "puntuación en este Trasfondo a cualquier reserva Social, incluso junto con tu Estatus u otras Habilidades.\n"
                + "Muchos miembros de la Mano, sin embargo, eligen no\n"
                + "revelar sus lealtades. La Mano Negra es muy competente al cazar Sabbat que presumen de membresía en\n"
                + "la Secta pero no pertenecen a ella de verdad (mentirosos, tened cuidado).\n"
                + "• Eres soldado raso; puedes pedir ayuda a\n"
                + "un miembro de la Mano Negra una vez\n"
                + "por historia.•• Eres conocido y respetado en la Mano\n"
                + "Negra; puedes pedir ayuda a dos miembros de la Mano Negra una vez por\n"
                + "historia.\n"
                + "••• Se te tiene en alta estima en la Mano\n"
                + "Negra; puedes pedir ayuda a cinco\n"
                + "miembros de la Mano Negra una vez\n"
                + "por historia.\n"
                + "•••• Eres un héroe entre los miembros de\n"
                + "la Mano Negra; puedes pedir ayuda\n"
                + "a siete miembros de la Mano Negra\n"
                + "dos veces por historia (pero es mejor\n"
                + "que tengas una buena razón; si parece\n"
                + "que te ablandas, puedes perder puntos\n"
                + "en este Trasfondo). Puedes también\n"
                + "liderar en batalla a un gran número de\n"
                + "miembros de la Mano si alguna vez es\n"
                + "necesario.\n"
                + "••••• Eres parte de las leyendas de la Mano\n"
                + "Negra; puedes llamar a 12 miembros de\n"
                + "la Mano Negra dos veces por historia\n"
                + "(pero ten en cuenta el aviso previo).\n"
                + "También puedes liderar en batalla a un\n"
                + "gran número de miembros de la Mano\n"
                + "en acción si hace falta. Puede incluso\n"
                + "que los Serafines busquen tu consejo\n"
                + "en asuntos de importancia"));
        Trasfondos.add(new Trasfondo(0, "Rebaño", "Has formado un grupo de mortales de quienes puedes alimentarte sin miedo. Un Rebaño puede tomar\n"
                + "muchas formas, desde círculos de fiesteros fetichistas\n"
                + "a cultos reales formados a tu alrededor como si fueras\n"
                + "una figura divina. Además de proveer alimento, tu\n"
                + "Rebaño podría ser útil para tareas menores, aunque\n"
                + "normalmente no son demasiado controlables, ni están conectados estrechamente a ti, ni son particularmente capaces (para peones más eficaces, adquiere\n"
                + "Aliados o Criados). Tu puntuación de Rebaño añade\n"
                + "dados a tus tiradas para Cazar; ver pág. 259 para más\n"
                + "detalles.\n"
                + "Los jugadores pueden adquirir Rebaño con puntos de\n"
                + "Trasfondo Compartido.\n"
                + "• Tres recipientes.\n"
                + "•• Siete recipientes.\n"
                + "••• 15 recipientes.\n"
                + "•••• 30 recipientes.\n"
                + "••••• 60 recipientes"));
        Trasfondos.add(new Trasfondo(0, "Recursos", " Recursos son los bienes valiosos que están a disposición\n"
                + "de tu personaje. Estas posesiones pueden ser dinero en\n"
                + "efectivo, pero cuando este Trasfondo se incrementa, es\n"
                + "más probable que sean inversiones, propiedades o réditos\n"
                + "de capitales de alguna clase: tierras, inversiones industriales, acciones y bonos, mercancías, infraestructuras criminales, contrabando o incluso impuestos o diezmos. Recuerda que los vampiros no necesitan disponer de comida\n"
                + "excepto Sangre y que sus necesidades reales (opuestas a\n"
                + "sus preferencias) de cobijo son muy asequibles. Los Recursos para los vampiros consisten principalmente en pagar\n"
                + "los lujos y gastos asociados al desarrollo y mantenimiento\n"
                + "de Estatus, Influencia y otros Trasfondos. Un personaje\n"
                + "sin puntos en Recursos puede tener suficiente ropa y suministros para salir adelante o podría ser un indigente que\n"
                + "ocupa el embalaje de un frigorífico debajo de un puente.\n"
                + "Recibes una renta básica cada mes basada en tu puntuación, así que asegúrate de detallar exactamente de\n"
                + "dónde viene este dinero, sea un trabajo, un fideicomiso\n"
                + "o dividendos. (Los Narradores deciden según tu localización y un período de tiempo relevante una cantidad de\n"
                + "dinero en efectivo adecuada para tu renta mensual). Después de todo, la fortuna de un Vástago podría muy bien\n"
                + "agotarse en el transcurso de una crónica, dependiendo de\n"
                + "cómo de bien la mantenga. También puedes vender tus\n"
                + "recursos menos líquidos si necesitas efectivo, pero esto\n"
                + "puede requerir semanas o incluso meses, dependiendo de\n"
                + "lo que trates de vender en concreto. Los compradores de\n"
                + "arte no caen de los árboles después de todo.\n"
                + "Los jugadores pueden adquirir Recursos para sus personajes con puntos de Trasfondo Compartido.\n"
                + "• Suficiente. Puedes mantener una\n"
                + "residencia típica de la clase trabajadora\n"
                + "con estabilidad, incluso con infrecuentes derroches.\n"
                + "•• Moderado. Puedes mostrarte como un\n"
                + "miembro próspero de la clase media, con\n"
                + "el regalo o capricho ocasionales propios de alguien de una posición incluso\n"
                + "superior. Puedes costearte un sirviente\n"
                + "o contratar ayuda especializada en caso\n"
                + "necesario. Una fracción de tus recursos\n"
                + "está disponible en dinero, propiedades\n"
                + "fácilmente transportables (como joyería\n"
                + "o mobiliario) y otros enseres de valor\n"
                + "(como un coche o un hogar modesto)\n"
                + "que te permiten mantener un nivel de\n"
                + "vida como en el primer punto allá donde\n"
                + "te encuentres, hasta seis meses. ••• Confortable. Eres un destacado y bien\n"
                + "establecido miembro de tu comunidad,\n"
                + "con tierras y una vivienda en propiedad, y tienes una reputación que te\n"
                + "permite tirar de crédito de forma muy\n"
                + "generosa. Probablemente, también\n"
                + "tienes más activos y bienes que dinero\n"
                + "en efectivo. Puedes mantener una calidad de vida de un punto donde quiera\n"
                + "que estés sin dificultad cuanto tiempo\n"
                + "quieras.\n"
                + "•••• Rico. Rara vez tocas dinero en efectivo,\n"
                + "ya que la mayoría de tus activos existen\n"
                + "en formas intangibles que son más\n"
                + "valiosas y estables que el papel moneda.\n"
                + "Acumulas más riqueza que la mayor\n"
                + "parte de tus semejantes (si se les puede\n"
                + "llamar así). Cuando la adquisición de\n"
                + "tus Recursos no disfrute de tu habitual\n"
                + "grado de atención, puedes mantener\n"
                + "una existencia de tres puntos hasta un\n"
                + "año, y de dos indefinidamente.\n"
                + "••••• Extremadamente Rico. Eres el modelo\n"
                + "de lo que otros luchan por alcanzar,\n"
                + "al menos en la mente popular. Los\n"
                + "programas de televisión, las portadas\n"
                + "de las revistas y las webs de cotilleos\n"
                + "hablan sobre tu ropa, el mobiliario de\n"
                + "tus numerosas casas y el lujo de tus\n"
                + "vehículos. Tienes amplias y muy repartidas inversiones, quizás vinculadas\n"
                + "a los destinos de naciones, cada una\n"
                + "con mucho personal y conexiones con\n"
                + "todos los niveles de la sociedad de una\n"
                + "región. Viajas siempre con un mínimo de comodidades de 3 puntos, más\n"
                + "con algo de esfuerzo. Corporaciones\n"
                + "y gobiernos a veces acuden a ti para\n"
                + "comprar valores o emisiones de bonos"));
        Trasfondos.add(new Trasfondo(0, "Rituales", "Este Trasfondo sólo está disponible para personajes del Sabbat.\n"
                + "Conoces los Ritae y rituales del Sabbat y puedes realizar muchos de ellos. Este Trasfondo es vital para ser un\n"
                + "Sacerdote de manada, pues sin él, los Ritae no funcionarán. Esto es en realidad una investidura sobrenatural,\n"
                + "que emana de la magia de los más antiguos hechiceros\n"
                + "Tzimisce. Los Vampiros del Sabbat que no sean Sacerdotes de sus manadas deberían tener una razón excepcional para adquirirlo, ya que los Sacerdotes son reacios a\n"
                + "compartir sus secretos con los miembros más seculares de\n"
                + "la Secta. Algunos ejemplos de rituales incluyen la Vaulderie (ver pág. 301), así como aquéllos presentes en el\n"
                + "Apéndice (ver pág. 507).\n"
                + "• Conoces unos pocos Auctoritas Ritae\n"
                + "(a tu elección).\n"
                + "•• Conoces algunos Auctoritas Ritae\n"
                + "(a tu elección) y unos pocos Ignoblis\n"
                + "Ritae (a tu elección).\n"
                + "••• Conoces todos los Auctoritas Ritae y\n"
                + "algunos Ignoblis Ritae (a tu elección).\n"
                + "Además, puedes crear Ignoblis Ritae\n"
                + "propios con suficiente tiempo (consulta a tu Narrador para tiempo de\n"
                + "desarrollo y efectos en el juego).\n"
                + "•••• Conoces todos los Auctoritas Ritae y\n"
                + "muchos Ignoblis Ritae (a tu elección).\n"
                + "Puedes crear Ignoblis Ritae propios con\n"
                + "suficiente tiempo (consulta a tu Narrador para tiempo de desarrollo y efectos\n"
                + "en el juego). Estás además familiarizado\n"
                + "con las funciones de numerosos Ignoblis\n"
                + "Ritae regionales y específicos de manadas, incluso si no puedes realizarlos.\n"
                + "••••• Conoces todos los Auctoritas Ritae y docenas de Ignoblis Ritae (a tu elección).\n"
                + "Puedes crear Ignoblis Ritae propios con\n"
                + "suficiente tiempo (consulta a tu Narrador para tiempo de desarrollo y efectos\n"
                + "en el juego). Estás además familiarizado con las funciones de casi todos los\n"
                + "Ignoblis Ritae regionales y específicos de\n"
                + "manadas, incluso si no puedes realizarlos;\n"
                + "si ha sido transcrito o transmitido a la\n"
                + "tradición, has oído hablar de él"));

        return Trasfondos;

    }

    public static ArrayList<atributo> Atributos_F_V20() {
        ArrayList<atributo> atributos = new ArrayList<>();
        atributos.add(new atributo("Fuerza",
                "Fuerza es la potencia física bruta del personaje. Determina el peso que éste puede levantar o empujar y\n"
                + "cómo de fuerte puede golpear a otro personaje u objeto.\n"
                + "El Rasgo Fuerza se suma a la reserva de dados de daño\n"
                + "del personaje cuando consigue alcanzar a su oponente en\n"
                + "combate cuerpo a cuerpo. También se emplea si se quiere romper, levantar o transportar algo, así como cuando\n"
                + "un personaje desea realizar un salto."
                + "• Malo: Puedes levantar algo menos de\n"
                + "20 kg (40 lb).\n"
                + "•• Normal: Puedes levantar cerca de 50\n"
                + "kg (100 lb).\n"
                + "••• Bueno: Puedes levantar poco más de\n"
                + "100 kg (250 lb).\n"
                + "•••• Excepcional: Puedes levantar casi 200\n"
                + "kg (400 lb).\n"
                + "••••• Sobresaliente: Puedes levantar unos\n"
                + "300 kg (650 lb.) y aplastar cráneos\n"
                + "como si fueran uvas.\n"
                + "Especialidades: Agarre Fuerte, Brazos Potentes, Reservas de Fuerza, Violento"));
        atributos.add(new atributo("Destreza", "El Atributo Destreza determina la pericia general del\n"
                + "personaje. Incluye su rapidez, su agilidad y su velocidad\n"
                + "general, además de indicar su capacidad para manipular\n"
                + "objetos con control y precisión. En este Atributo se incluyen también la coordinación ojo-mano, los reflejos y\n"
                + "la gracia de movimientos.\n"
                + "• Malo: Eres bastante torpe. Baja esa\n"
                + "pistola antes de que te hagas daño.\n"
                + "•• Normal: No eres patoso, pero tampoco\n"
                + "una bailarina.\n"
                + "••• Bueno: Tienes un cierto potencial\n"
                + "atlético.\n"
                + "•••• Excepcional: Si quisieras podrías ser\n"
                + "acróbata.\n"
                + "••••• Sobresaliente: Tus movimientos son lí-\n"
                + "quidos e hipnóticos, casi sobrehumanos.\n"
                + "Especialidades: Preciso, Veloz, Gracia Felina, Reflejos\n"
                + "Rápidos."));
        atributos.add(new atributo("Resistencia", "El Rasgo Resistencia refleja la salud, aguante y vigor\n"
                + "de un personaje. Indica hasta qué punto puede forzarse y cuánto castigo es capaz de soportar antes de sufrir\n"
                + "un trauma físico. Resistencia también incluye una cierta\n"
                + "fortaleza mental que representa el aguante y la tenacidad\n"
                + "del personaje.\n"
                + "• Malo: No soportas un viento fuerte.\n"
                + "•• Normal: Estás en buena forma y puedes\n"
                + "aguantar un par de puñetazos.\n"
                + "••• Bueno: Tu condición física es muy\n"
                + "buena y apenas padeces enfermedades.\n"
                + "•••• Excepcional: Podrías correr (y quizá\n"
                + "ganar) cualquier maratón que quisieras.\n"
                + "••••• Sobresaliente: Tu constitución es realmente hercúlea.\n"
                + "Especialidades: Infatigable, Decidido, Duro Como el\n"
                + "Acero, Vigoroso."));
        return atributos;
    }

    public static ArrayList<atributo> Atributos_S_V20() {
        ArrayList<atributo> atributos = new ArrayList<>();
        atributos.add(new atributo("Carisma", "arisma\n"
                + "Carisma es la capacidad de un personaje de agradar\n"
                + "a los demás mediante su personalidad. Este Atributo se\n"
                + "emplea cuando un personaje trata de ganarse la simpatía de otro o cuando intenta que los demás confíen en\n"
                + "él; refleja su poder para encantar e influenciar. Carisma\n"
                + "determina la capacidad del personaje para convencer a\n"
                + "los demás de sus puntos de vista. Este Atributo no indica\n"
                + "necesariamente de qué manera el personaje es carismático, puede tratarse de un embaucador de pico de oro o de\n"
                + "un matón sarcástico (esto debe manifestarse a través de\n"
                + "la interpretación y las Especialidades).\n"
                + "• Malo: No tienes mucha personalidad.\n"
                + "•• Normal: Sueles caer bien y tienes algunos amigos.\n"
                + "••• Bueno: La gente siempre confía en ti.\n"
                + "•••• Excepcional: Posees un gran magnetismo personal.\n"
                + "••••• Sobresaliente: Culturas enteras podrían seguir tu liderazgo.\n"
                + "Especialidades: Elegante, Labia, Convincente, Sofisticado, Agudo, Elocuente, Embaucador."));
        atributos.add(new atributo("Manipulación", "Manipulación determina la capacidad de un personaje\n"
                + "para conseguir de un modo u otro que los demás compartan sus puntos de vista o sigan sus dictados. En resumen,\n"
                + "sirve para que los demás hagan lo que uno quiera. Entra\n"
                + "en escena cuando un personaje intenta influir o guiar\n"
                + "sutilmente el comportamiento de otro, y se utiliza para\n"
                + "engañar, embaucar, confundir o coaccionar a otros personajes. No importa que les guste o no el manipulador\n"
                + "(en esto se diferencia de Carisma). Después de todo un\n"
                + "motivador habilidoso puede incluso emplear los talentos\n"
                + "de aquéllos que lo odian. La Manipulación es un juego peligroso, aunque sea\n"
                + "la forma principal en la que muchos Vástagos afectan\n"
                + "al mundo que los rodea. Los fallos pueden provocar la\n"
                + "ira de la supuesta víctima, y un fracaso puede añadir un\n"
                + "nombre más a la lista de enemigos del personaje.\n"
                + "La gente es manipulada todos los días y normalmente lo ignora («¿Por qué no vas a la tienda por mí?»).\n"
                + "Sin embargo, si a la gente se le señala el hecho, suele\n"
                + "adoptar una postura bastante defensiva. La Manipulación puede ser el arma más poderosa en el repertorio de un Vástago, pero los fallos son potencialmente\n"
                + "desastrosos. Los personajes con puntuaciones altas en\n"
                + "Manipulación suelen recibir la desconfianza de los\n"
                + "demás.\n"
                + "• Malo: Una persona de pocas (y a menudo ineficaces) palabras.\n"
                + "•• Normal: A veces puedes engañar a\n"
                + "otros, como casi todo el mundo.\n"
                + "••• Bueno: Siempre consigues descuentos.\n"
                + "•••• Excepcional: Podrías ser político o\n"
                + "líder de una secta.\n"
                + "••••• Sobresaliente: «¡Por supuesto! ¡Le diré\n"
                + "al Príncipe que fui yo el que intentó\n"
                + "estacarlo!»\n"
                + "Especialidades: Persuasivo, Seductor, Razonable,\n"
                + "Liante, Invocador de “Hechos”."));
        atributos.add(new atributo("Apariencia", "El Atributo Apariencia es una medida de cómo de\n"
                + "buena es la primera impresión que da un personaje.\n"
                + "Puede tratarse de un “atractivo” convencional, pero\n"
                + "también puede ser el efecto de rasgos distintivos: un\n"
                + "aspecto exótico, un aire de confianza, una postura imponente, estilo para vestir bien o cualquier cosa que sea\n"
                + "notable al ver por primera vez al personaje. Ciertamente, Apariencia es un amalgama de muchas características descriptivas personales. Es inconsciente e instintiva: apela a los niveles inferiores de la psique, de modo\n"
                + "que afecta a las primeras impresiones y a la naturaleza\n"
                + "de los recuerdos posteriores.\n"
                + "Este Rasgo sirve para algo más que conseguir que recipientes potenciales te sigan por la pista de baile. En situaciones en las que la primera impresión es importante,\n"
                + "o que estén relacionadas con gente que valora el aspecto\n"
                + "físico, un personaje podría ver sus reservas de dados Sociales limitada a su puntuación en Apariencia. Por tanto, es importante tener el mejor aspecto posible o que se\n"
                + "te conozca antes de empezar a pedir ayuda para incendiar\n"
                + "el refugio del Justicar."
                + "• Malo: Tus ropas apestan, la gente te\n"
                + "evita, o simplemente eres condenadamente feo.\n"
                + "•• Normal: No destacas en una multitud,\n"
                + "para bien o para mal.\n"
                + "••• Bueno: «Déjame invitarte a un trago».\n"
                + "•••• Excepcional: La gente se desvía de su\n"
                + "camino para conocerte.\n"
                + "••••• Sobresaliente: La gente nunca se olvida de ti.\n"
                + "Especialidades: Estilo Poco Convencional, Fotogénico, Sentido de la Moda, Rostro Inolvidable, Pose Memorable"));
        return atributos;
    }

    public static ArrayList<atributo> Atributos_M_V20() {
        ArrayList<atributo> atributos = new ArrayList<>();
        atributos.add(new atributo("Perfeción", "Percepción mide la capacidad del personaje de observar su entorno. Puede tratarse de un esfuerzo consciente\n"
                + "(como registrar una zona), pero normalmente es un acto\n"
                + "intuitivo en el que los sentidos del personaje detectan algo\n"
                + "fuera de lo común. Percepción es la sensibilidad del personaje hacia lo que lo rodea, y no suele estar presente en los\n"
                + "cínicos y los hastiados (que ya lo han visto todo).\n"
                + "Se emplea para determinar si un personaje comprende una determinada situación y si detecta un estímulo\n"
                + "ambiental. Puede advertir al personaje de emboscadas,\n"
                + "distinguir una pista en un montón de basura o desvelar\n"
                + "cualquier detalle oculto o bien camuflado, ya sea físico o\n"
                + "de otra naturaleza.\n"
                + "• Malo: Quizás estés totalmente absorto\n"
                + "en ti mismo o seas sencillamente un\n"
                + "cabeza hueca; en cualquier caso, ¡cuidado con ese coche!\n"
                + "•• Normal: Las sutilezas se te escapan,\n"
                + "pero eres capaz de percibir la imagen\n"
                + "general.\n"
                + "••• Bueno: Percibes ambientes, texturas y\n"
                + "cambios minúsculos en tu entorno.\n"
                + "•••• Excepcional: Prácticamente nada se te\n"
                + "escapa.\n"
                + "••••• Sobresaliente: Observas inmediatamente cosas casi imperceptibles para\n"
                + "los sentidos humanos."
                + "Especialidades: Atento, Perspicaz, Cuidadoso, Sagaz,\n"
                + "Táctico."));
        atributos.add(new atributo("Inteligencia", "nteligencia\n"
                + "El Atributo Inteligencia se refiere a la capacidad del\n"
                + "personaje de aprehender hechos y conocimientos. Además controla la capacidad del personaje de razonar, resolver problemas y evaluar situaciones. Inteligencia también incluye el pensamiento crítico y flexible.\n"
                + "Inteligencia no incluye la experiencia, la sabiduría,\n"
                + "ni el sentido común, ya que éstas son propiedades de la\n"
                + "personalidad del personaje, no Rasgos. Hasta el personaje más inteligente puede ser demasiado insensato como\n"
                + "para darse cuenta de que los matones que le piden las\n"
                + "llaves del coche no pueden querer nada bueno.\n"
                + "Los personajes con una Inteligencia baja no son necesariamente estúpidos (aunque puede ser el caso), sino\n"
                + "que podrían carecer de educación o tener un razonamiento muy simple. Del mismo modo, no todos los que\n"
                + "tienen Inteligencia alta son Einsteins; pueden ser buenos\n"
                + "memorizando o tener un juicio especialmente agudo.\n"
                + "• Malo: No eres el más listo de la clase.\n"
                + "•• Normal: Lo suficientemente listo como\n"
                + "para saberte normal.\n"
                + "••• Bueno: Más despierto que las masas.\n"
                + "•••• Excepcional: No sólo eres listo, sino\n"
                + "realmente brillante.\n"
                + "••••• Sobresaliente: Auténtico genio.\n"
                + "Especialidades: Conocimiento Teórico, Creativo,\n"
                + "Analítico, Resolución de Problemas, Autoridad en una\n"
                + "Materia."));
        atributos.add(new atributo("Astucia", "El Rasgo Astucia mide la habilidad del personaje para\n"
                + "pensar sobre la marcha y reaccionar rápidamente en una\n"
                + "situación dada, y también refleja el ingenio general. Los\n"
                + "personajes con una Astucia baja serán algo torpes y de\n"
                + "mente aletargada, o quizá crédulos y poco sofisticados.\n"
                + "En cambio, los personajes con una puntuación elevada\n"
                + "en este Atributo casi siempre dan con un plan de forma\n"
                + "inmediata y se adaptan a su entorno de forma apropiada.\n"
                + "Dichos personajes también logran mantener la calma en\n"
                + "situaciones tensas.\n"
                + "• Malo: Tírame del dedo.\n"
                + "•• Normal: Sabes cuándo apostar y cuándo plantarte en el póquer.\n"
                + "••• Bueno: No suelen sorprenderte ni\n"
                + "dejarte sin palabras "
                + "•••• Excepcional: Eres de esos tipos que hacen que al día siguiente todos piensen:\n"
                + "«Oh, debería haber dicho...»\n"
                + "••••• Sobresaliente: Piensas y respondes más\n"
                + "rápido de lo que actúas.\n"
                + "Especialidades: Llevar la Iniciativa, Ocurrente, Cambios de Estrategia, Emboscadas"));
        return atributos;
    }

    public static ArrayList<habilidad> Talentos_V20() {
        ArrayList<habilidad> habilidades = new ArrayList<>();

        habilidades.add(new habilidad("Alerta", ""));
        habilidades.add(new habilidad("Atletismo", ""));
        habilidades.add(new habilidad("Callejeo", ""));
        habilidades.add(new habilidad("Conciencia", ""));
        habilidades.add(new habilidad("Empatia", ""));
        habilidades.add(new habilidad("Expresión", ""));
        habilidades.add(new habilidad("Intimidación", ""));
        habilidades.add(new habilidad("Liderazgo", ""));
        habilidades.add(new habilidad("Pelea", ""));
        habilidades.add(new habilidad("Subterfugio", ""));

        return habilidades;
    }

    public static ArrayList<habilidad> Tecnicas_V20() {
        ArrayList<habilidad> habilidades = new ArrayList<>();

        habilidades.add(new habilidad("Armas de Fuego", ""));
        habilidades.add(new habilidad("Artesania", ""));
        habilidades.add(new habilidad("Conducir", ""));
        habilidades.add(new habilidad("Etiqueta", ""));
        habilidades.add(new habilidad("Interpretación", ""));
        habilidades.add(new habilidad("Latrocinio", ""));
        habilidades.add(new habilidad("Pelea con Armas", ""));
        habilidades.add(new habilidad("Sigilo", ""));
        habilidades.add(new habilidad("Supervivencia", ""));
        habilidades.add(new habilidad("Trato con animales", ""));

        return habilidades;
    }

    public static ArrayList<habilidad> Conocimiento_V20() {
        ArrayList<habilidad> habilidades = new ArrayList<>();

        habilidades.add(new habilidad("Academicismo", ""));
        habilidades.add(new habilidad("Ciencia", ""));
        habilidades.add(new habilidad("Finanzas", ""));
        habilidades.add(new habilidad("Investigacion", ""));
        habilidades.add(new habilidad("Leyes", ""));
        habilidades.add(new habilidad("Medicina", ""));
        habilidades.add(new habilidad("Ociltismo", ""));
        habilidades.add(new habilidad("Política", ""));
        habilidades.add(new habilidad("Tecnología", ""));
        habilidades.add(new habilidad("", ""));

        return habilidades;
    }

    public static ArrayList<valor> valores() {
        ArrayList<valor> valor = new ArrayList<>();
        valor.add(new valor(0, "OOOOO"));
        valor.add(new valor(1, "•OOOO"));
        valor.add(new valor(2, "••OOO"));
        valor.add(new valor(3, "•••OO"));
        valor.add(new valor(4, "••••O"));
        valor.add(new valor(5, "•••••"));
        valor.add(new valor(6, "••••• •OOOO"));
        valor.add(new valor(7, "••••• ••OOO"));
        valor.add(new valor(8, "••••• •••OO"));
        valor.add(new valor(9, "••••• ••••O"));
        valor.add(new valor(10, "••••• •••••"));

        return valor;
    }

    public static ArrayList<Sendas>  Sendas_V20() {
        ArrayList<Sendas> sendas = new ArrayList<>();
    
        sendas.add(new Sendas("Acuerdo Honorable", "Caballeros", "Conciencia", "Autocontrol"));
        sendas.get(0).setPorte("");
        sendas.get(0).setCreencias("");
        sendas.get(0).setEtica("");
        sendas.get(0).setHistoria("");
        sendas.get(0).setPracticas_actuales("");
        sendas.get(0).setD_seguidores("");
        sendas.get(0).setSeguir_s("");
        sendas.get(0).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Armonia", "Bestias", "Convicción", "Instinto"));
        sendas.get(1).setPorte("");
        sendas.get(1).setCreencias("");
        sendas.get(1).setEtica("");
        sendas.get(1).setHistoria("");
        sendas.get(1).setPracticas_actuales("");
        sendas.get(1).setD_seguidores("");
        sendas.get(1).setSeguir_s("");
        sendas.get(1).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Caín", "Nodistas", "Convicción", "Instinto"));
        sendas.get(2).setPorte("");
        sendas.get(2).setCreencias("");
        sendas.get(2).setEtica("");
        sendas.get(2).setHistoria("");
        sendas.get(2).setPracticas_actuales("");
        sendas.get(2).setD_seguidores("");
        sendas.get(2).setSeguir_s("");
        sendas.get(2).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Cataros", "Albigenses", "Convicción", "Instinto"));
        sendas.get(3).setPorte("");
        sendas.get(3).setCreencias("");
        sendas.get(3).setEtica("");
        sendas.get(3).setHistoria("");
        sendas.get(3).setPracticas_actuales("");
        sendas.get(3).setD_seguidores("");
        sendas.get(3).setSeguir_s("");
        sendas.get(3).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Corazón Salvaje", "Bestias", "Convicción", "Instinto"));
        sendas.get(4).setPorte("");
        sendas.get(4).setCreencias("");
        sendas.get(4).setEtica("");
        sendas.get(4).setHistoria("");
        sendas.get(4).setPracticas_actuales("");
        sendas.get(4).setD_seguidores("");
        sendas.get(4).setSeguir_s("");
        sendas.get(4).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Huesos", "Sepultureros", "Convicción", "Autocontrol"));
        sendas.get(5).setPorte("");
        sendas.get(5).setCreencias("");
        sendas.get(5).setEtica("");
        sendas.get(5).setHistoria("");
        sendas.get(5).setPracticas_actuales("");
        sendas.get(5).setD_seguidores("");
        sendas.get(5).setSeguir_s("");
        sendas.get(5).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Lilith", "Bahari, Lilin", "Convicción", "Instinto"));
        sendas.get(6).setPorte("");
        sendas.get(6).setCreencias("");
        sendas.get(6).setEtica("");
        sendas.get(6).setHistoria("");
        sendas.get(6).setPracticas_actuales("");
        sendas.get(6).setD_seguidores("");
        sendas.get(6).setSeguir_s("");
        sendas.get(6).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Metamorfosis", "Metamorfosistas", "Convicción", "Instintos"));
        sendas.get(7).setPorte("");
        sendas.get(7).setCreencias("");
        sendas.get(7).setEtica("");
        sendas.get(7).setHistoria("");
        sendas.get(7).setPracticas_actuales("");
        sendas.get(7).setD_seguidores("");
        sendas.get(7).setSeguir_s("");
        sendas.get(7).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Muerte y el Alma", "", "Convicción", "Autocontrol"));
        sendas.get(8).setPorte("");
        sendas.get(8).setCreencias("");
        sendas.get(8).setEtica("");
        sendas.get(8).setHistoria("");
        sendas.get(8).setPracticas_actuales("");
        sendas.get(8).setD_seguidores("");
        sendas.get(8).setSeguir_s("");
        sendas.get(8).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Noche", "Nihilistas", "Convicción", "Instinto"));
        sendas.get(9).setPorte("");
        sendas.get(9).setCreencias("");
        sendas.get(9).setEtica("");
        sendas.get(9).setHistoria("");
        sendas.get(9).setPracticas_actuales("");
        sendas.get(9).setD_seguidores("");
        sendas.get(9).setSeguir_s("");
        sendas.get(9).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Paradoja", "Shilmulo", "Convicción", "Autocontrol"));
        sendas.get(10).setPorte("");
        sendas.get(10).setCreencias("");
        sendas.get(10).setEtica("");
        sendas.get(10).setHistoria("");
        sendas.get(10).setPracticas_actuales("");
        sendas.get(10).setD_seguidores("");
        sendas.get(10).setSeguir_s("");
        sendas.get(10).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Poder y la Voz Interior", "unificadores", "Convicción", "Instinto"));
        sendas.get(11).setPorte("");
        sendas.get(11).setCreencias("");
        sendas.get(11).setEtica("");
        sendas.get(11).setHistoria("");
        sendas.get(11).setPracticas_actuales("");
        sendas.get(11).setD_seguidores("");
        sendas.get(11).setSeguir_s("");
        sendas.get(11).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Sangre", "Derviches", "Convicción", "Autocontrol"));
        sendas.get(12).setPorte("");
        sendas.get(12).setCreencias("");
        sendas.get(12).setEtica("");
        sendas.get(12).setHistoria("");
        sendas.get(12).setPracticas_actuales("");
        sendas.get(12).setD_seguidores("");
        sendas.get(12).setSeguir_s("");
        sendas.get(12).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Tifón", "Teoficidios, Corruptores", "Convicción", "Autocontrol"));
        sendas.get(13).setPorte("");
        sendas.get(13).setCreencias("");
        sendas.get(13).setEtica("");
        sendas.get(13).setHistoria("");
        sendas.get(13).setPracticas_actuales("");
        sendas.get(13).setD_seguidores("");
        sendas.get(13).setSeguir_s("");
        sendas.get(13).setJerarquia(new Image("media/insignias/Gangrel.png"));
        
        sendas.add(new Sendas("Humanidad", "", "", ""));
        sendas.get(14).setPorte("");
        sendas.get(14).setCreencias("");
        sendas.get(14).setEtica("");
        sendas.get(14).setHistoria("");
        sendas.get(14).setPracticas_actuales("");
        sendas.get(14).setD_seguidores("");
        sendas.get(14).setSeguir_s("");
        sendas.get(14).setJerarquia(new Image("media/insignias/Gangrel.png"));
        return  sendas;
    }
    
    public static  ArrayList<Disciplina> Disciplinas_v20(){
            ArrayList<Disciplina>disciplina=new ArrayList<>();
            disciplina.add(new Disciplina("Animalismo"));
            disciplina.add(new Disciplina("Auspex"));
            disciplina.add(new Disciplina("Celeridad"));
            disciplina.add(new Disciplina("Dementación"));
            disciplina.add(new Disciplina("Dominación"));
            disciplina.add(new Disciplina("Extinción"));
            disciplina.add(new Disciplina("Fortaleza"));
            disciplina.add(new Disciplina("Necromancia",true));
            disciplina.add(new Disciplina("Obtenebración"));
            disciplina.add(new Disciplina("Ofuscación"));
            disciplina.add(new Disciplina("Potencia"));
            disciplina.add(new Disciplina("Presencia"));
            disciplina.add(new Disciplina("Protean"));
            disciplina.add(new Disciplina("Quimerismo"));
            disciplina.add(new Disciplina("Serpentis"));
            disciplina.add(new Disciplina("Taumaturgia",true));
            disciplina.add(new Disciplina("Vicisitud"));
            return disciplina;
    }
    
 public static  ArrayList<N_Disciplina> n_disciplinas(){
      ArrayList<N_Disciplina> Nivel_Disciplina=new ArrayList<>();
      String d="";
      
     // Nivel_Disciplina.add(new N_Disciplina(Disciplina, Nombre, Descripcion, 0));
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      d="disciplina";
              
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 1));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 2));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 3));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 4));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 5));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 6));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 7));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 8));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 9));
      Nivel_Disciplina.add(new N_Disciplina(d, "", "", 10));
      
      return Nivel_Disciplina;
 }   
    
}
