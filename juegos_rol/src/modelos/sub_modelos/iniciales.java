/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.sub_modelos;

import java.time.format.TextStyle;
import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author donpe
 */
public class iniciales {

    public static ArrayList<nat_con> naturalezas_conducta_V20() {
        ArrayList<nat_con> Nat_Con = new ArrayList<>();
        Nat_Con.add(new nat_con("Ansioso de Emociones", "Este Arquetipo vive por la emoción del peligro. Al contrario que las personas más cuerdas, el Ansioso de Emociones se involucra en todo tipo de actividades peligrosas y potencialmente mortales. No se comporta conscientemente de forma suicida o autodestructiva, pero sí que busca el estímulo del desastre inminente. Los pandilleros, rateros y exhibicionistas son ejemplos de este Arquetipo. Los Vástagos Ansiosos de Emociones pueden romper habitualmente la Mascarada sólo para ver si los atrapan, pueden mantener contacto con un Clan o Secta rival, o pueden conspirar activamente para destronar al Príncipe sólo para ver si pueden lograrlo. —Recuperas un punto de Fuerza de Voluntad cada vez que tengas éxito en una tarea peligrosa que hayas aceptado deliberadamente. Los Ansiosos de Emociones tampoco son estúpidos, así que el Narrador puede no recompensar a un jugador que envíe a su personaje al peligro con el único motivo de cosechar Fuerza de Voluntad"));
        Nat_Con.add(new nat_con("Arquitecto", "El Arquitecto posee un sentido del propósito mayor incluso que él mismo. Sólo está contento cuando crea algo de valor perdurable para los demás. La gente siempre necesitará cosas, y el Arquitecto obtiene satisfacción proporcionando lo que es posible. Los inventores, pioneros, fundadores de ciudades y empresarios osados suelen tener el Arquetipo Arquitecto. Un Vástago Arquitecto puede buscar crear nuevas leyes que afecten a sus compañeros no-muertos o puede aspirar a establecer un nuevo dominio Anarquista. —Recuperas un punto de Fuerza de Voluntad cuando establezcas algo de importancia o valor duradero. "));
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
        Assamitas.setDescripcion("Los Chiquillos de Haqim, conocidos como Assamitas por el resto de los Vástagos, son un cuchillo silencioso en la oscuridad, una orden de ejecutores sedientos de Sangre que participa en las guerras secretas de los no-muertos actuando como asesinos a sueldo. Fuera del alcance de  las Sectas, los Assamitas son auténticos Independientes  y mercenarios, ofreciendo sus servicios a quienquiera que  pague su precio en Sangre, al margen de la ley del Príncipe o del Priscus. Para cuando su objetivo se da cuenta de  que un Assamita lo está acechando, suele ser demasiado  tarde. Huelga decir que los Asesinos son temidos y denostados por muchos otros Clanes.  En realidad, los Assamitas son mucho más que unos  simples matones y asesinos. El suyo es un Clan complejo pero aislado, basado en tres principios: la sabiduría, la  hechicería y la Diablerie. Sin embargo, la mayoría de los  Assamitas con los que se encuentran otros vampiros son  miembros de la casta guerrera, así que la sociedad de los  Vástagos los ve de esa manera. Por su parte, los Asesinos  no han hecho nada para desmentir este malentendido. Si  los ayuda a conseguir más contratos y oculta la verdadera  naturaleza de su Clan, mejor para ellos.  Hace mucho, los Assamitas fueron sometidos por medio de una poderosa maldición, conjurada por los Tremere bajo las órdenes de la Camarilla, que puso freno  a su sed de Sangre. No pueden probar la Vitae de otro  vampiro sin que esto les cause daño. En su constante búsqueda para reducir su Generación y acercarse a su sagrada  figura, Haqim (quien algunos eruditos de fuera del Clan  afirman que pertenecía a la Segunda Generación, mientras que otros insisten en que fue un juez designado por  los otros Antediluvianos), los Assamitas han de refinar la  Sangre de Vástago en una solución alquímica. Si no fuera  por este yugo místico, seguramente estarían inmersos en  una impía cruzada de Diablerie sin control.");
        Assamitas.setApodo("Asesinos");
        Assamitas.setSecta("independientes");
        Assamitas.setSecta_des("Para casi todo, los Assamitas tienden a ser Independientes, dejando que las Sectas los contraten para  operar en sus propios términos. Dicho esto, algunos Assamitas creen que una alianza con la Camarilla o el Sabbat  podría permitir que el Clan se mantuviera más fuerte.");
        Assamitas.setApariencia("Los Assamitas más viejos suelen provenir  de culturas de Oriente Medio o del Norte de África, aunque cada vez es más habitual que los jóvenes Assamitas  provengan de orígenes más diversos. En sus ambientes  tradicionales, los Assamitas prefieren vestirse conforme  a las costumbres religiosas o del Clan. Cuando están en público, sin embargo,  los Assamitas visten igual  que los oriundos del  lugar, lo que les permite cumplir sus contratos sin que nadie  note nada extraño.  La piel de un Assamita se oscurece con  la edad (al contrario  que la de los otros  vampiros, cuya piel  se hace más pálida); los Assamitas particularmente antiguos tienen un  tono de piel similar al ébano.");
        Assamitas.setRefugio("Los Assamitas suelen compartir refugios comunales con otros miembros de su célula local, estructuras remotas que les permiten vigilar los dominios más  grandes desde la distancia. Estos refugios normalmente  están bien equipados, pero no son tan lujosos como para  no poder trasladarse al completo en poco tiempo. Algunos Assamitas también tienden a mantener guaridas personales de naturaleza mucho más humilde para cuando  necesiten un lugar en el que no llamar la atención");
        Assamitas.setTrasfondo("Aquéllos Abrazados por el Clan Assamita  tienden a caer en dos tipos diferenciados: los miembros  “provinciales” del Clan encajan en su lugar de origen sea  cual sea y pueden mezclarse sin problemas con la gente que los rodea; los de clase alta trascienden culturas,  respaldados por su habilidad para hacer frente a desafíos  interpersonales e intelectuales.");
        Assamitas.setCreacion(" Los Atributos Físicos tienden a  ser los primarios, aunque algunos Assamitas prefieren los  Atributos Sociales para que los ayuden a acercarse a su presa. Prefieren por igual los Talentos y Técnicas, pero los Conocimientos pueden ser de ayuda para un Assamita si fuese  necesario. Pocos Asesinos cultivan grandes Trasfondos y, en  lugar de ello, se especializan en un abanico de Disciplinas  que aumentan su eficiencia. Los Assamitas más consumados  siguen la Senda de Iluminación propia de su Clan y aquéllos  que no lo hacen suelen tener que hacer grandes esfuerzos  para mantener sus Virtudes y Humanidad");
        Assamitas.setDebilidad("Debido a la Maldición de Sangre de los  Tremere, en caso de que un Assamita consuma la Sangre  de otro Vástago, sufrirá un nivel de daño letal automático no absorbible por cada punto que beba. Los intentos  de Diablerie resultan en daño agravado automático, un  nivel de Salud por cada punto de Fuerza de Voluntad permanente que posea su víctima; el Diabolista no ganará  ningún beneficio (incluyendo la reducción de Generación) si sobrevive al proceso. Además, el Assamita debe  ofrecer como diezmo una parte de los beneficios de sus  contratos a su Sire o a sus superiores (por lo general, un  diez por ciento de sus ganancias)");

        Assamitas.setOrganizacion("Una organización aislada y jerárquica  da forma a la mayoría de las costumbres de los Assamitas.  “El Viejo de la Montaña”, el maestro asesino que tiene su  refugio en la fortaleza del monte Alamut, es la autoridad  definitiva; el Clan obedece las órdenes que les transmite con una mezcla de reverencia y terror. Por norma, las cé lulas individuales y locales de Assamitas, conocidas como falaqi, tienen licencia para actuar con mayor autonomía, aunque son raros los que traicionan la causa.");
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
        Brujah.setDescripcion("El legado de los Brujah es uno de dorados tiempos pasados arruinados por sus fogosas naturalezas. Suya fue la gloria de la antigua Cartago, pero la traición de los Ventrue  de Roma acabó con el sueño. Desde entonces, los Brujah  les han guardado rencor.  En las noches actuales, los Brujah  son rebeldes y  provocadores,  pandilleros que  llevan bates y  agentes del cambio en una sociedad paralizada desde hace  mucho. Como rebeldes que son, está en su naturaleza desafiar el status quo... aunque, a veces, cuando no encuentran  oposición, ellos mismos personifican el status quo. Funciona bien, pues siempre hay un Brujah exaltado esperando  entre bastidores para derrocar a un compañero de Clan  al que se le han subido los humos y que está demasiado  cómodo en su papel de rebelde convertido en dictador.  Más que ningún otro Clan, los Brujah aún sienten las llamas  de las pasiones que los inspiraron siendo mortales. Aman las  causas y son rápidos en actuar ante discursos emotivos, acusaciones de injusticia o llamadas a las armas. Esta conexión  con las pasiones puede ser una bendición, pero la inspiración también puede llevar a la locura y el Ansia de la Bestia.  Ningún Príncipe sabio da la espalda a los Brujah. Es  raro que la Chusma permita que la manipulen o que la  adulen. Ante todo, un Brujah es su propio amo, y aquéllos  que quieran someterlo se enfrentan a una difícil tarea. Si  uno de ellos piensa que le están dando la pajita más  corta, hará trizas a sus enemigos primero y después,  quizás, recuerde hacer preguntas, sin importarle si  es un Primogénito o una autoridad mortal.  Algunos historiadores de los Vástagos afirman que  los Brujah se excusan en la antigua traición que sufrieron para adoptar el papel de agitadores contra el  mismo orden que ayudan a sostener. Otros aseguran  que los Brujah se han sometido a la voluntad de ese  mismo orden, siendo poco más que una oposición leal  sin poder alguno. A la mayoría de los Brujah les da lo  mismo mientras alguien necesite una buena patada  en el culo y puedan ser ellos quienes la den.");

        Brujah.setApodo("Chusma");
        Brujah.setSecta("camarilla");
        Brujah.setSecta_des(" Pese a toda su rebeldía, el  Clan Brujah normalmente se considera miembro de la Camarilla. A veces la Chusma  joven imita el salvajismo del Sabbat,  pero los Antiguos sostienen que  la Torre de Marfil les proporciona una estructura adecuada contra la  que enfocar su rabia");
        Brujah.setApariencia(" Muchos Brujah adoptan estilos y maneras que reflejan una actitud de rebelión. Pelo multicolor,  cabezas rapadas, clavos, tachuelas, prendas fetichistas y  camisetas con eslóganes insolentes pueden ser adecuados  para un Brujah. Aunque no todos llevan el “uniforme”:  la Chusma normalmente disfruta llevando atuendos que  buscan provocar. Algunos jóvenes Brujah prefieren dispositivos móviles como sus herramientas para la resistencia y  pueden convocar un altercado con sólo tocar una pantalla");
        Brujah.setRefugio(" Puede que los Brujah sientan afinidad por  una ciudad, pero raramente desarrollan estos lazos con  localizaciones específicas. Así, en cualquier momento,  un Brujah probablemente tendrá media docena o más de  escondites, refugios y pisos disponibles. Normalmente,  son viejos y están en malas condiciones hasta que el Brujah los necesita. Sus refugios pueden también albergar  mortales que sigan la ideología del vampiro o su culto  a la personalidad. Algo muy práctico: nunca viene mal  tener un recipiente a mano en caso de emergencia.");
        Brujah.setTrasfondo("Al ser criaturas pasionales, los Brujah a  menudo Abrazan sin pensárselo mucho, y sus Chiquillos  tienden a ser un grupo dispar. A veces, Abrazan a quienes comparten una visión o entusiasmo similar por la  misma causa que su futuro Sire. Otras veces, infligen el  Abrazo a aquéllos de ideología opuesta, maldiciendo al  rival con el vampirismo como castigo.");

        Brujah.setCreacion("Los Brujah normalmente (aunque no exclusivamente) provienen de mortales con personalidades violentas o rebeldes. Sus Naturalezas y Conductas  son a menudo similares, ya que los Brujah tienen poca paciencia para los engaños. Tienden hacia los Atributos Físicos, con los Sociales y Mentales bastante igualados. Muchos  prefieren las Técnicas y Talentos, pero la mayoría respeta  los Conocimientos que los hacen algo más que matones.  Contactos, Aliados y Rebaño son Trasfondos comunes.");
        Brujah.setDebilidad("Las mismas pasiones que inspiran a los  Brujah a la grandeza o la depravación, si se mantienen  sin restricciones, pueden llevarles a una rabia incandescente: las dificultades de las tiradas para resistir o guiar  el Frenesí (ver pág. 290) son dos puntos superiores a las  normales. Además, un Brujah nunca puede gastar Fuerza  de Voluntad para evitar el Frenesí, aunque puede gastar  un punto de Fuerza de Voluntad para intentar controlar  un Frenesí que ya haya comenzado");
        Brujah.setOrganizacion("Ciertas causas ascienden y caen entre la  élite Brujah, pero algunas de las más persistentes son las  llamadas Idealistas e Iconoclastas. Los Iconoclastas quieren  destruirlo todo, mientras que los Idealistas disfrutan resolviendo los problemas a través de la teoría. Esto evoca las raí-  ces clásicas de los Brujah como reyes filósofos, y los más Idealistas están entre las filas de los Brujah Ancillae y Antiguos.");
        Brujah.addDisciplina("Celeridad");
        Brujah.addDisciplina("Potencia");
        Brujah.addDisciplina("Presencia");
        Brujah.setInsignia(new Image("media/insignias/Brujah.png"));

        Gangrel.setDescripcion("Un destello de ojos rojos en la oscuridad, el olor almizcleño de un depredador, un brillo de colmillos, el sonido  de la carne al desgarrarse: éstas son las marcas de la presencia de los Gangrel. Más que ningún otro Clan, los Gangrel  se parecen a las bestias asociadas con las leyendas de vampiros: murciélagos, lobos y otras criatura de la noche. De  hecho, los Forasteros pueden desarrollar la habilidad de  transformarse en ésas y otras formas más primitivas.  Los Gangrel comparten también otras características  en común con los animales. Muchos rechazan los elaborados constructos sociales de la Estirpe y la Grey. Algunos prefieren moverse solos o en pequeñas manadas o  coteries. La mayoría son duros y, cuando los presionan,  feroces. Al sucumbir a las depredaciones de la Bestia, adquieren algunos rasgos que recuerdan al reino animal.  Como Clan, son precavidos y distantes. La mayoría preferiría pasar sus noches acechando presas o haciendo el  salvaje por azoteas antes que atendiendo a los edictos de  los Príncipes o presionando para que se les reconozca un  dominio. Mantienen una relación tensa con el resto de la  Estirpe y están entre quienes más frecuentemente se convierten en Anarquistas o Autarcas. En algunos lugares,  los Gangrel han abandonado colectivamente la pertenencia a cualquier Secta (en la medida que los  Gangrel hacen algo colectivamente).  La Jyhad parece menos pronunciada entre los  Gangrel que entre el resto de los Clanes y los  Forasteros tienen poco interés en el conflicto  eterno. Las diferencias entre los Gangrel a menudo son acerca de fronteras entre dominios y derechos de  Caza en lugar de desconfianza generacional, y las cosas  que preocupan a los jóvenes Forasteros son las mismas  que preocupan a los Ancillae e incluso a los Antiguos  Gangrel. Aun así, sería difícil considerar amigables  las relaciones entre generaciones diferentes,  excepto en situaciones en las que Sire y  Chiquillo estén aislados. La Bestia siempre sospecha de quienes puedan arrebatarle el sustento.");

        Gangrel.setApodo("Forasteros");
        Gangrel.setSecta("Camarilla");
        Gangrel.setSecta_des("Secta: Los Gangrel pertenecen, al menos nominalmente, a la Camarilla, pero siempre han tenido una facción muy ruidosa que rechaza la pertenencia a cualquier  Secta. Afirman que juegos políticos y estructuras sociales no aportan nada a su naturaleza primaria.");
        Gangrel.setApariencia("El propio aspecto no es una de las prioridades de la mayoría de los  Gangrel, cuya apariencia es, a menudo, más cuestión  de las circunstancias que de una  decisión. La Debilidad del Clan  puede modificarla  en gran medida,  tanto como una  larga no-vida  en los lugares que convierten en sus refugios, que suelen carecer de comodidades modernas.");
        Gangrel.setRefugio(" Habitualmente, los Gangrel se guarecen donde pueden ante la amenaza de la salida del Sol. Los que  tienen refugios permanentes normalmente tienden a lo  funcional: cualquier lugar desde una cueva a un callejón  puede servir de refugio a un Gangrel, sin tener apenas  signos que lo identifiquen como territorio personal (hasta que es demasiado tarde para el desafortunado intruso).");
        Gangrel.setTrasfondo("Los Gangrel Abrazan igual que buscan  presas: tras largas Cacerías en las que el futuro Chiquillo  ni siquiera sabe que lo están siguiendo. Crear un Retoño  significa compartir recursos limitados, así que cada relación entre Sire y Chiquillo es única y significativa. Los  Forasteros Abrazan porque escogen al individuo, no por  capricho o por imprudencia. Aquéllos que se ganan su  atención son duros, física o emocionalmente");
        Gangrel.setCreacion("La autosuficiencia es la marca  de los Gangrel, y la mayoría tiene Arquetipos de personalidad independientes o solitarios. Los Atributos Físicos  son, de lejos, los más comunes, así como los Talentos con  algunas nociones de Técnicas y Conocimientos. La mayoría de los Gangrel se centra más en las Disciplinas que  en los Trasfondos, prefiriendo confiar en sí mismos antes  que en otros. Los Gangrel casi nunca tienen puntuaciones significativas en Recursos, Influencia o Criados.");

        Gangrel.setDebilidad(" Siempre que un Gangrel entra en Frenesí, adquiere una característica animal temporal (que puede reemplazar una existente). Una zona con pelo, un ligero aletargamiento tras alimentarse, incomodidad entre  multitudes: todos éstos pueden ser signos que marquen  a un Forastero tras un Frenesí. Estos rasgos no tienen  por qué ser únicamente físicos: pueden afectar también  al comportamiento. Los jugadores deberían trabajar con  el Narrador para decidir qué nueva característica animal  se adquiere (en las situaciones en las que el instinto de  luchar o huir pueda ser relevante). Con el tiempo, o ante  situaciones extraordinarias, una característica animal en  concreto puede hacerse permanente, apareciendo una  nueva con el siguiente Frenesí. Una buena guía es que  cada rasgo de Frenesí tenga un efecto en términos del sistema (como una reducción temporal de la puntuación de  un Atributo Social o una pérdida permanente de Humanidad), aunque algunos Narradores pueden preferir que  los rasgos tengan únicamente efectos a nivel narrativo");
        Gangrel.setOrganizacion("Hay reuniones regionales de Gangrel basadas en costumbres étnicas o culturales. Son eventos informales, orientados más al intercambio de información y a  festejar que a hacer progresar cualquier plan secreto. Aparte  de estas reuniones infrecuentes, casi toda la organización de  los Gangrel es principalmente local, si es que existe alguna  en absoluto, desde parejas de Sire y Chiquillo a terribles manadas centradas alrededor de un poderoso Forastero.");

        Gangrel.addDisciplina("Animalismo");
        Gangrel.addDisciplina("Fortaleza");
        Gangrel.addDisciplina("Protean");
        Gangrel.setInsignia(new Image("media/insignias/Gangrel.png"));

        Giovanni.setDescripcion("Tras ganar prominencia durante el Renacimiento veneciano, la familia Giovanni construyó su fortuna sobre  el ascenso de la clase media y los rápidos beneficios de  la banca y el comercio en el Mediterráneo (y las empresas criminales que los acompañaban). Sin embargo,  al desear el paterfamilias aún más poder, junto con  el progreso de la familia vino el orgullo y, con  éste, el horror. En la cima de su poder mortal,  Augustus Giovanni se dedicó al arte de controlar a los muertos, ganándose así el Abrazo  de un Antediluviano hoy olvidado. Junto  con un cónclave de conspiradores, los  Giovanni hundieron en el olvido a  un Clan y construyeron su propio  legado sobre el cadáver.  Desde esas primeras noches, los  Giovanni no han aceptado límite alguno a sus ambiciones, a pesar de la  oposición de los Vástagos de fuera de  su Clan y de una merecida reputación como “Vástagos Diabólicos”.  Estudiaron artes prohibidas, volviéndose formidables en el manejo  de la nigromancia, que les permitió  tener poder sobre los espíritus de  los muertos, y la degeneración  siguió a los rituales impíos. Hoy  en día, los Giovanni son conocidos por el aislacionismo de su  Clan y las prácticas incestuosas  con las que lo perpetúan. Unas  pocas familias y grupos externos  están bajo su protección, pero la  gran mayoría del Clan proviene  de su corrupta familia mortal.  Ésta sigue medrando a pesar de  sus abominables caprichos, y ha  amasado una enorme fortuna mediante el crimen, la política y los  secretos de los muertos, la cual  los mantiene en su posición de  degradada opulencia.  En público, los Giovanni hacen gala de gran humildad y respeto. En parte es un hábito secular, adquirido  cuando los otros Clanes cazaban a los Necromantes  usurpadores (y mantenido para preservar su duramente  ganada neutralidad en el conflicto entre la Camarilla  y el Sabbat). Otra cosa es el guante de terciopelo  cubriendo el puño de hierro de su auténtica naturaleza, notable por doblegar tanto a fantasmas  como a mentes y cuerpos para que se rindan a  sus necesidades. Según los Giovanni, tanto  Príncipes como Arzobispos les deben favores, y cualquiera con algo que ofrecer puede ganar su patrocinio.  En su mayor parte, los Giovanni  apenas participan en la Jyhad, pues  buscan sus propios objetivos: cultivar su fortuna y asentar los cimientos  de su poder en las tierras tras el velo  de la muerte. Los ajenos a la familia  rara vez comprenden los objetivos  de los Necromantes, pues sólo los  más fieles a los Giovanni saben  que el Clan quiere llevar el mundo a un estado en donde muertos y vivos se mezclen. Y, con su  maestría en la Necromancia, los  Giovanni estarían en posición de  gobernarlos a todos");

        Giovanni.setApodo("necromantes");
        Giovanni.setApariencia(" Exteriormente,  los Giovanni visten con discreción y buen gusto. La mayoría  proviene de su familia mortal  original y no sólo son de piel  aceitunada como muchos italianos, sino que también presentan algunos rasgos heredados de su familia. Quienes no  son parientes cercanos son  fáciles de identificar, y se visten como sea costumbre en la  región de su rama familiar.");
        Giovanni.setRefugio(" La fortuna de los Giovanni es evidente en sus  refugios, que suelen ser villas o lujosas fincas. Los Necromantes a menudo tienen objetos de valor en ellos, desde  galerías de arte a expositores de joyas. Muchos Giovanni  tienen además refugios secundarios, donde pueden tener  complejas criptas necrománticas o ser sencillamente pisos en los que ocultarse si fuera necesario");

        Giovanni.setCreacion(" Los Giovanni habitualmente  tienen Conductas sociables y profesionales que ocultan  crueles Naturalezas retorcidas durante su educación. Los  Atributos Mentales o Sociales son generalmente primarios, aunque algunos “soldados” de la familia prefieren los  Físicos. El mismo énfasis hace que se primen los Conocimientos o los Talentos, dependiendo de la propensión  personal. La parte del Clan que prefiere los Trasfondos  prácticos (particularmente, los relacionados con los bienes materiales y el ejercicio de su influencia) diverge de  quienes prefieren el poder prohibido de las Disciplinas.  Pocos Giovanni podrían ser descritos como equilibrados.");

        Giovanni.setDebilidad("El Beso de los Giovanni causa un dolor  insoportable a los mortales que lo reciben. Si uno de  ellos no es cuidadoso, su víctima podría morir a causa del  shock y la agonía antes de ser desangrado completamente. Cuando un Giovanni se alimenta de un mortal, hace  el doble de daño que infligiría el Beso de otro vampiro.  Por ejemplo, si un Giovanni toma un punto de Sangre  de un recipiente mortal, la víctima sufre dos niveles de  Salud de daño. Como resultado, tienden a utilizar bancos de sangre y otros medios de alimentarse menos problemáticos");

        Giovanni.setOrganizacion("Piramidales como pocos otros Clanes,  los Necromantes tienen una estructura en la cual las decisiones las toma el aún (presuntamente) activo progenitor del Clan, Augustus. La familia mantiene un enorme  palazzo llamado el Mausoleo en Venecia, donde tanto  Antiguos como Retoños bailan al son que marcan los vetustos vampiros moviendo los hilos del Clan. La estructura de éste es familiar, con las complicaciones añadidas  que ofrecen la degeneración y el vampirismo. El incesto,  la adoración de los ancestros, la necrofilia, los cultos al  remordimiento y anormales relaciones en las que padres y  abuelas son Chiquillos de su propia descendencia, enmarañan aún más Clan y familia y quiebran la mente de muchos Giovanni aún antes de transformarse en Vástagos.");

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
        Lasombra.setDescripcion("Para la mente de los Lasombra, es mejor reinar en el  infierno que servir en el cielo. El miedo, el Frenesí, la  capacidad de determinar si otro vive o muere: éstas son  las raíces del poder que los Lasombra tienen en tan alta  estima. Mientras otros vampiros tratan en vano de mantener a la Bestia bajo control o ceder completamente  ante ella, los Lasombra golpean a la Bestia hasta  que la someten, invocándola cuando les  conviene pero dejándola atrapada en  su interior cuando  desean controlarse.  Es debido a estas  predilecciones que  los Lasombra se consideran una “nobleza  oscura”, una aristocracia de la noche que  escoge la supremacía  de los Cainitas  por encima  de la veneración de la Mascarada. Con respecto a ideas  tales como redención o salvación son cínicos en el mejor  de los casos, y gran parte de la pompa que formó la actitud  del Clan antes de la existencia del Sabbat permanece sólo  como la más negra ironía o una burla abierta. No obstante,  los Lasombra todavía aprecian la grandeza y los rituales  de la Iglesia y de la aristocracia; además, el Clan fue fundamental no sólo al establecer muchos de los rituales del  Sabbat, sino también las instituciones que evitan que éste  sucumba al caos cada noche.  Tanto si se ven como instrumentos de Dios o como desterrados de Su creación, los Lasombra creen que tienen  un deber (ya sea con su Secta, Clan, manada o incluso  simplemente con ellos mismos), y el compromiso con sus  responsabilidades les otorga una retorcida sensación de  servir a una causa. Incluso un Cabezapala Lasombra puede considerarse a sí mismo superior a los demás; un sorprendente número de los Lasombra Abrazados en masa  sobreviven, quizás gracias a la intervención de sus Sires.  Aunque la noche pertenece a todos los Vástagos, los  Lasombra han nacido realmente en la oscuridad, hasta el  punto de que el propio nombre de su Clan manifiesta sus  lazos con las sombras. Suya es la Disciplina Obtenebración, y les permite manipular el material del que están hechas las sombras y la oscuridad, e incluso llegar más allá de  la oscuridad del mundo físico e introducirse en el Abismo  que yace tras ella.");
        Lasombra.setApodo("Guardianes (como en «el guardián de mi hermano»).");
        Lasombra.setSecta("Sabbat");
        Lasombra.setSecta_des(" El Sabbat sería muy diferente sin la influencia  de los Lasombra, y sigue siendo su Clan más prominente.  Los jóvenes Lasombra a menudo tienen prometedores  comienzos como Ducti o Sacerdotes del Sabbat, dirigiendo a sus compañeros a la lucha o demostrando su  dominio sobre la Bestia.");
        Lasombra.setApariencia(": Los Lasombra suelen ser atractivos. Ya sea  por la ascendencia española, italiana o morisca asociada  con el Clan, o por trasfondos modernos más cosmopolitas, los Guardianes mantienen una figura imponente. Su  ropa a menudo es conservadora o religiosa, procedente  de años de ceremonia y fiel ritual. Raro es el Lasombra  que no puede al menos manipular las sombras para escenificar una entrada dramática o una pose enigmática");

        Lasombra.setRefugio(" La obligación del liderazgo conduce a muchos Lasombra jóvenes a mantener Refugios Comunales  con otros miembros de su manada. Los Guardianes más  ricos y los que son anteriores a la Secta a menudo tienen  sus propios refugios, ya sean suites en siniestros áticos o  enormes villas del Viejo Mundo");
        Lasombra.setTrasfondo("Los futuros Sires del Clan Lasombra buscan tanto erudición como ambición en sus Chiquillos  potenciales. Así, muchos Lasombra tienen antecedentes  profesionales y presentan personalidades extrovertidas e  incluso agresivas. El mérito a los ojos de sus Sires lleva  lejos a los Retoños Lasombra, y los Guardianes no dudan en purgar sus filas de Chiquillos defectuosos, vagos  o groseros");
        Lasombra.setCreacion(" Los Lasombra suelen tener  Naturalezas y Conductas dispares. Los Atributos Sociales y Mentales son los primarios con la misma frecuencia.  Las Habilidades tienden a ser escasas y a estar especializadas, como muestra de las pericias individuales. Los  Guardianes se interesan por todo tipo de Trasfondos por  igual en (inicialmente) pequeñas cantidades, para poder  diversificarse mejor");

        Lasombra.setDebilidad(" Los vampiros Lasombra no tienen reflejo. Ya sea en un espejo, en un cuerpo de agua, sobre una  superficie pulida o en el retrovisor de un taxi, la imagen  de los Guardianes no se refleja");
        Lasombra.setOrganizacion(" Para los Lasombra, las noches de la alta  aristocracia nunca acabaron, y los títulos y cargos que un  observador moderno podría asociar con el pasado aún  tienen gran peso entre los Guardianes. Un complejo sistema de patronazgo, tutelaje y linaje caracteriza al Clan,  similar al de cortes e iglesias de siglos pretéritos. Los Chiquillos se benefician enormemente de los Sires más estimados y viceversa, mientras que los actos que confieren  estatus en la Secta o en el Clan también pueden elevar a  los compañeros del Lasombra siempre que asocie su éxito  con ellos");

        Malkavian.setDescripcion("Los Malkavian están doblemente malditos: una vez  por la maldición de ser Vástagos y otra, por la extrema  confusión que perturba sus corazones y mentes. Tras el  Abrazo, todo Malkavian se ve afectado por una locura insuperable que quiebra su comportamiento noche tras noche a partir de ese momento, llenando  su no-vida de locura. Algunos lo consideran una  forma de percepción oracular, mientras que otros  simplemente los consideran peligrosos.  Que nadie se engañe: la locura de los Luná-  ticos es un alienante y doloroso fenómeno que  causa aislamiento, pero que ocasionalmente les  otorga un destello de comprensión o un punto de  vista hasta entonces desconocido. Esta locura puede  tomar la forma de una enfermedad mental clínica o  puede ser una forma de hipersensibilidad de los sentidos que otros desconocen tener; un titiritero sobrenatural moviendo los hilos del Malkavian o la  sensación de que el Lunático está de algún modo  más avanzado evolutivamente. Un Malkavian  puede creer ser una idea que ha cobrado forma  física o el avatar de un concepto que el Mundo de Tinieblas aún ha de encontrar. Puede ser  un psicópata salvaje e imparable, o puede ser un  individuo mayormente lúcido que a veces queda catatónico por miedo a un cataclismo cósmico inminente.  Su precaria estabilidad dificulta que los otros Vástagos  (o cualquier mortal con el que se encuentren) interactúen con los Malkavian. El Clan a veces se recrea en  elaboradas, terroríficas y peligrosas “bromas” que los ayudan poco a ganarse la simpatía de los demás vampiros.  Estos incidentes en teoría sirven para educar al objetivo,  pero a menudo la lección puede perderse entre los intentos del vampiro de ponerse a salvo y la incapacidad para  analizar la lógica interna del Malkavian. Bromas comunes podrían ser reemplazar la puerta del refugio de un  banal Toreador por una guillotina, redistribuir la fortuna  de un Antiguo Brujah mientras éste se encuentra en el  Elíseo o, incluso, dar información de dónde se reúnen los  Nosferatu a un cazador. Los Vástagos temen y odian la  palabra “broma” casi tanto como a los mismos Lunáticos");
        Nosferatu.setDescripcion("Quienes dudan que el Abrazo sea una maldición sólo  tienen que mirar a los Nosferatu. El Abrazo deforma a  los miembros de este Clan convirtiéndolos en horribles  monstruos retorcidos por la marca de Caín. Como tales,  merodean y se ocultan en las sombras, y a menudo causan la ira y la burla de otros Vástagos por su horripilante  aspecto. Otros están tan aterrorizados o asqueados por  los Nosferatu que estos retorcidos Vástagos apenas tienen interacción social alguna.  Para ser justos, los Nosferatu llegan a  poseer muchos de los secretos  susurrados por sus reacios camaradas. Las Ratas de Alcantarilla disfrutan de un  reticente respeto  como comerc i a n t e s  de información de los Vástagos, dada su capacidad para  el sigilo y el hecho de que muchos Vástagos los ignorarían antes que prestarles atención. Los Nosferatu hábiles  aprovechan al máximo esta situación, utilizando la hipocresía de otros vampiros en su provecho.  A grandes rasgos, la condición de los Nosferatu es solitaria y aislada. Cómo reaccionan a la Maldición de Caín varía según su actitud y resistencia mental, pero es difícil ser  objeto de una repulsión absoluta y no dejar que esto cambie tu disposición hacia el resto de los Vástagos de alguna  manera. Algunas Ratas de Alcantarilla son crueles, tan  retorcidas en su interior como lo son en su exterior, mientras que otras son criaturas trágicas y desgraciadas, que han  sido malditas con una eterna condición de marginados sin  ninguna capacidad de elección. Algunos de ellos incluso  adoptan el papel de profetas o avatares de los Condenados,  encarnado físicamente el fantasmagórico acertijo, “Bestia  soy, para en bestia no convertirme”.");
        Ravnos.setDescripcion("Los Ravnos se mueven como los rumores que los rodean.  Son el ladrón en la noche, el raksha perseguido por el viento, las pesadillas demasiado temibles como para ser reales.  Tanto si se los asocia con el pueblo romaní de Europa del  Este o con los ladrones de tumbas ghûl del Asia occidental,  la sociedad de los Vástagos carga a los Ravnos con prejuicios de podredumbre moral, suciedad y picaresca.  Con una reputación como ésa, se considera a los  Ravnos marginados incluso entre aquellos Vástagos que no se alían con las Sectas. Muchos jó-  venes Ravnos tienden hacia no-vidas nómadas,  moviéndose de un dominio al siguiente o escondiéndose en los límites de los territorios  establecidos desde donde pueden escapar si el sentir de los Vástagos locales  se vuelve en su contra. Esto exacerba  su reputación como vagabundos, gitanos y plagas errantes, pero los  vampiros Ravnos se  adaptan bien, prosperando en sus papeles de marginados.  De hecho, muchos  escogen convertirse  en los terrores salvajes  que los otros Vástagos  creen que son.  Los más cultivados  entre los Ravnos siguen  una ideología propia del  Clan inspirada en el ciclo de la reencarnación a  la que se adhieren muchas  creencias de la India. No  obstante, entre algunos  miembros jóvenes y amorales del Clan, esta filosofía se convierte en una  inclinación al capricho o  una excusa para el caos.  Son estos últimos Vástagos los que dan un mal  nombre a los Ravnos, pero incluso los devotos resultan  extraños para muchos vampiros.  Los Ravnos practican una singular Disciplina conocida como Quimerismo que convence a sus enemigos de  que ven cosas que realmente no existen. Ésta es la culpable de que los otros Vástagos piensen que los Ravnos  comercian con mentiras y engaños, pero también  puede probar ser la salvación de un Embustero y facilitar los caprichos de una  no-vida marginal.");
        Seguidores_de_Set.setDescripcion("La adicción, el envilecimiento, la corrupción y la desesperación aterrorizan a muchos Vástagos que temen que su  no-vida sea un fracaso, pero para los Seguidores de Set,  éstas y muchas otras son las herramientas  con las que comercian. Chulos,  camellos y sacerdotes, los Setitas satisfacen las necesidades de los desesperados y,  al hacerlo, los convierten  a una causa nihilista.  Tanto si uno necesita  placeres carnales, dinero, drogas u oscuros  secretos, los Seguidores de Set  pueden proveerlo y, cuando lo hacen, se aseguran de que  aquéllos que los buscan volverán.  Los Seguidores de Set son tanto una religión ctónica  como un Clan, aunque el Clan es parte de su doctrina. Su  mitología es compleja y enrevesada, un panteón impenetrable de dioses monstruosos. En la cúspide de su culto se  sitúa un sincretismo de Set, el señor egipcio del Inframundo, y la hidra griega Tifón, tanto guardianes espirituales de  los lugares secretos como “libertadores” de las almas ajenas. Para los demás, todo esto es una afectación religiosa y  blasfema, pero para los devotos Setitas el culto y la causa  son reales, y su señor oscuro actúa a través de ellos.  No es necesario decir que la política de desesperación  y el aplacamiento de sus malvados dioses sitúan a las  Serpientes fuera de la sociedad de los Vástagos. A los  Setitas ya les va bien así. Los vampiros a menudo tienen  necesidad de algo que ofrecen los Seguidores de Set, y  éstos están muy felices de, además, guardar el secreto… por un cuantioso precio. Los Setitas ofrecen un  pacto con el diablo, pero en sus propios términos. De  esa manera, cuando reciben su pago y alimentan con  sangre y almas las fauces de Tifón, todos los sacrificios han sido entregados de forma voluntaria.");
        Toreador.setDescripcion("Desde la perspectiva de los Toreador, cuando el Sol se  pone, la oscuridad da paso a un mundo eterno y asombroso. Todo está cargado de fascinación y horror, baja política y glorias sensuales, lo profundo y lo profano, y un  innegable trasfondo de crueldad. Estos Vástagos son los  Toreador, y pasan sus no-vidas cobijados en el placer.  Por supuesto, para vampiros con estas inclinaciones es fácil hastiarse y amargarse. Más que  los otros Clanes, suelen sucumbir al tedio, y  combaten el aburrimiento ocasional de la  estática inmortalidad jugando a las rivalidades. El exceso de estímulos los vuelve  esclavos de las sensaciones que buscan.  Los Toreador más inmorales pueden convertirse en  auténticos monstruos, hundiéndose en niveles inimaginables de depravación  buscando sentir algo.  Los Vástagos del Clan  Toreador suelen involucrarse mucho en el mundo de los  mortales. Tienen infinitas razones,  ya sea disfrutar de la proximidad  del hálito de la vida, cultivar auténticos cultos de seguidores que  los adoren, o influir y seguir las  modas de las que su propia clase se  burla y venera. Según los Toreador,  ellos son las musas de un desesperado mundo mortal, sirviéndoles de  inspiración gracias a su belleza o su  patronazgo.  La cultura de los Toreador es una mezcla  de sibaritas, diletantes y visionarios. Algunos Toreador, aún con ecos de pasión  mortal, Abrazan a amantes o “proyectan”  Progenie que parece desafiar todas sus costumbres. Éstos o bien no duran demasiado  o se alzan para alcanzar gran prominencia como subversivos e individualistas.  Ideas, tendencias y “el próximo bombazo” se difunden a través del Clan, y  el resto de los Vástagos normalmente  observa a los Toreador para que los guíen. Los Degenerados lo saben, y muchos acaban siendo Arpías, Príncipes  y otras figuras clave de la sociedad vampírica.");
        Tremere.setDescripcion("En noches olvidadas por el paso del tiempo existían los  Tremere aunque, por aquel entonces, eran... diferentes.  Esos primeros Tremere hicieron un pacto (o pergeñaron  un hechizo o cualquier otro método horrible atribuido  al Clan) que los transformó en los vampiros que son actualmente. Algunos dicen que robaron la Maldición de  Caín de un Antediluviano en Letargo o que destilaron  la imperfecta inmortalidad de los Vástagos a partir de la  Vitae robada de otros vampiros. Estos misteriosos orígenes, que algunos describen como traicioneros e incluso  blasfemos, persiguen a los Tremere, pues el resto de los  Clanes los miran con desconfianza y sospecha. Su historia (y, de hecho, su legado moderno) está marcada por  la guerra de Clanes, resentimientos de hace siglos, y la  mancha de perniciosos misterios jamás resueltos.  En las noches actuales, es la práctica de la Magia  de Sangre la que ha dado forma al Clan  Tremere. La Taumaturgia, una Disciplina flexible, está muy arraigada entre los  Tremere, quienes mantienen refugios  en forma de cultos conocidos como  Capillas para estudiar sus usos y  compartir secretos entre  ellos. Para ellos, la sangre  es tanto sustento como  fuente de poder místico;  se reúnen en sus casas de  brujos para ampliar sus conocimientos sobre la Vitae  que es un elemento crucial en sus no-vidas.  Además de por la práctica de la Taumaturgia misma, se conoce a los Brujos por su  férrea jerarquía. Provienen del Viejo Mundo,  donde tienen una base de poder establecida en Viena  a la que todos sus miembros responden en mayor o  menor medida. Aunque pueden ser uno de los Clanes  más jóvenes (en los términos en los que las criaturas inmortales como los vampiros miden el tiempo)  son tan hábiles en la Jyhad como el resto de los Vástagos. Rodeados de enemigos que los llaman Usurpadores  y respaldados por aliados que pueden respetar o no las  alianzas que han logrado imponer, los Tremere han evolucionado para ser autosuficientes. De hecho, muchos de  los que los vigilan cautelosamente piensan que poseen  una ventaja demasiado grande, gracias a su flexible Disciplina y a la estructura protectora del Clan y las Capillas, y  se mueven en su contra tanto secreta como abiertamente.");
        Tzimisce.setDescripcion("Una Luna de sangre proyecta luz carmesí sobre la tierra  más allá del bosque y algo temible aúlla, agónico, en la  noche. Los Tzimisce llaman a estas tierras su hogar ancestral. Desde tiempos inmemoriales los Demonios han sido  amos y señores de los dominios de gran parte de Europa  del Este. Su Clan es orgulloso y egoísta, y para él las tradiciones sólo tienen valor hasta cierto punto, pese a sus orí-  genes nobles. De hecho, reivindican haber destruido a su  Antediluviano y que, a consecuencia de ese trascendental  evento, ayudaron a edificar los cimientos del Sabbat.  Practican una extraña Disciplina conocida como Vicisitud que les permite retorcer la piel y los huesos de sus  víctimas: suelen refinar sus artes de la carne  practicando sobre ellos mismos, pero la  usan con la misma frecuencia en lacayos y criados, transformando a boyardos  y Szlachta en monstruosos esclavos. La  propia Vicisitud es una Disciplina mal  entendida, y ocasionalmente los debates  sobre sus orígenes sumergen al Clan en  enconadas rivalidades.  El Tzimisce es un Clan de extremos:  largas y frías noches pasadas en remotos  castillos han hecho que la atención de los  Demonios se dirija tanto hacia el exterior  como hacia el interior. Los místicos del Clan  estudian una filosofía de la metamorfosis, buscando descubrir lo que yace más allá del estado  vampírico. Muchos Tzimisce se caracterizan por  una extraña espiritualidad seglar. Los jóvenes a menudo se sienten desligados del papel histórico de  los Demonios como terroríficos señores feudales, y  se entregan a una causa de su propia elección, ya  sea como fanáticos del Sabbat, horrores de carne  moldeada o trascendentales hechiceros Koldun.");
        Ventrue.setDescripcion("A través de la historia, mientras que los otros Clanes  se han arrastrado con sus pequeñas intrigas, los Ventrue  han cosechado el favor del César, susurrado al oído de  Carlomagno, financiado la Era de los Descubrimientos e,  incluso, influido en la política de la Santa Sede. El suyo  es un legado de gobierno, desde los  Retoños Ventrue en su ascenso  a la cima hasta los más poderosos Antiguos cuya influencia  abarca el mundo entero. Han  jugado durante mucho tiempo  a poner reyes en las sombras del  mundo mortal, y han sido durante  mucho tiempo el Clan de los Reyes entre los Vástagos.  El resto de los Clanes encuentra todo esto insufriblemente  pomposo en el mejor de  los casos, tediosamente  punible en el peor. Alguien tiene que dirigir  pero, ¿por qué siempre  tiene que ser un Ventrue con ínfulas? Los  Sangre Azul tratan de  soportar las críticas  de sus inferiores con  un sentido de noblesse oblige (pesada es siempre la  cabeza que lleva  la corona) pero incluso los líderes Vástagos más generosos sucumben  ocasionalmente a la tiranía y a la  rabia sangrienta.  En las noches actuales, los  Ventrue son una síntesis de lo  moderno y lo antiguo, a menudo en duro contraste dentro del  Clan y unos con otros. Suyo es  el dinero antiguo, de las bóvedas de  Creso, pero los jóvenes manipulan los  mercados financieros e influyen en las divisas. Los Antiguos pueden dirigir a ejércitos e incluso gobiernos al completo, mientras los Neonatos conjuran sus activos desde  una página web o una aplicación móvil. Pero a pesar de  toda su fortuna, su distinguida historia y su posición entre  los Condenados, todos y cada uno de los Ventrue aún deben buscar el único recurso que hace igualitaria a toda  la sociedad de la Estirpe: la preciosa Sangre.");

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

        Malkavian.setSecta_des(" En sus momentos de lucidez, los Malkavian  ofrecen puntos de vista poco ortodoxos y hacen de abogados del diablo para la Camarilla, ofreciendo sus visiones y su singular comprensión para cortar las redes  de engaños. Los Príncipes y Primogénitos toleran a los  Lunáticos en diverso grado, pero el Clan como entidad  siempre ha apoyado a la Torre de Marfil.");
        Nosferatu.setSecta_des("Al menos nominalmente, el Clan Nosferatu  pertenece a la Camarilla, aunque muchos de sus miembros se vuelven Autarcas o apoyan a los Anarquistas  en lugar de navegar por el mezquino laberinto social de  la Torre de Marfil. Algunos incluso mantienen que los  Nosferatu necesitan a la Camarilla porque sin ella no  tendrían compradores para su tráfico de secretos.");
        Ravnos.setSecta_des("Al Clan Ravnos suele costarle hacer caso del riguroso orden de las  ciudades de la Camarilla, y no posee el  inherente amor por la violencia del Sabbat. Así, los Embusteros son Independientes por falta de una opción mejor.");
        Seguidores_de_Set.setSecta_des("Aparentemente ninguna de las Sectas aceptaría a los Seguidores de Set. De puertas  adentro, los Setitas a veces se describen en términos tanto de Secta como de Clan. No tienen  un interés real por unirse ni a la Camarilla ni  al Sabbat, y sus objetivos son diferentes a los  de los Anarquistas.");
        Toreador.setSecta_des("La Camarilla no habría sobrevivido en las noches que siguieron a la Revuelta Anarquista sin  la participación sustancial de los Toreador, y  permanecen entre sus más apasionados partidarios.");
        Tremere.setSecta_des(" El Clan Tremere se considera uno de los Pilares de  la Camarilla. Se rumorea que una vez realizaron un ritual  que erradicó a todos aquéllos del Clan que  no eran leales a la Torre de Marfil (y,  por lo tanto, a la jerarquía piramidal de los Tremere).");
        Tzimisce.setSecta_des(" Los Tzimisce son miembros desde hace  mucho tiempo, aunque en gran medida distanciados, del Sabbat. Fueron fundamentales en el nacimiento de la Secta, y continúan siendo uno de sus  Clanes más numerosos.");
        Ventrue.setSecta_des(" Según los Ventrue, la misma idea de la Camarilla tuvo su origen en ellos. El resto de los Clanes se  dieron cuenta de la inestimable proposición que suponía y se arremolinaron en torno a su bandera.");

        Malkavian.setApariencia(" Pese a que los Malkavian pueden provenir de cualquier cultura, la locura que sigue al Abrazo  tiende a dirigirlos a extremos en cuanto a su aspecto.  Pueden aparecer desaliñados, heridos o, simplemente,  sucios. Podrían llevar aún las mismas ropas de la noche  de su Abrazo o haberlas robado de una lavandería o una tienda durante un momento de confusión o fuga disociativa. Por supuesto, es igual de posible que los Malkavian  sean meticulosos y estrictos con su apariencia, tratando  obsesivamente de parecer lo más normales posible");
        Nosferatu.setApariencia(": Los Vástagos Nosferatu a menudo tienen sus  refugios lejos del desdén y el desprecio del resto de los vampiros. Tanto si construyen sus madrigueras en las alcantarillas que sugiere su apodo como si esculpen un vasto nido de pesadilla en lo alto del campanario de una iglesia en ruinas,  las Ratas de Alcantarilla valoran el secretismo y prefieren  estar en su refugios lejos de sus enemigos. Los Nosferatu de  comportamiento más humilde pueden ocultarse en un edificio abandonado en un callejón poco transitado. Mientras  esté lejos de los demás Vástagos, es un buen refugio");
        Ravnos.setApariencia("Los Ravnos jóvenes a menudo provienen de población romaní de  Europa del Este, con un escaso número de  gadje (payos, “no gitanos”) en sus filas. Se  supone que los pocos Antiguos del Clan  que pueden quedar tienen su origen en  la India o en Oriente Medio. Dado que el  Clan está muy extendido y que no mantienen un dominio central tradicional, no se  puede decir que predomine una apariencia concreta, y cualquier Vástago mendigo puede ser de origen Ravnos.");
        Seguidores_de_Set.setApariencia(" Muchos de los Setitas más viejos provienen de etnias norteafricanas y mediterráneas nativas del territorio histórico de las  Serpientes, pero Abrazan libremente entre los mortales  de sus territorios adoptados. Algunos de los templos más  antiguos de los Setitas están ubicados en lugares donde las Serpientes “egipcias” podrían parecer fuera de  lugar pero en los que, sin embargo, las serpientes se  encuentran presentes en la mitología local, como en  Mesoamérica o incluso en territorios nórdicos; de esteVAMPIRO LA MASCARADA EDICIÓN 20º ANIVERSARIO 65  Cita: Sé qué necesitas.  Estereotipos  Assamitas: No son diferentes de nosotros, y eso les  aterroriza.  Brujah: Podríamos haber salvado su preciosa Cartago, pero, en su orgullo, eligieron una eternidad de  ridículo y fracaso.  Gangrel: No confundas su hosquedad con noble  salvajismo. Tienen sus vicios, como todos los demás.  Giovanni: Se distraen con los métodos y olvidan  sus objetivos.  Lasombra: Tras muchos exitosos Lasombra se  esconde una deuda con el templo.  Malkavian: Son excelentes aliados porque nadie  les presta atención, y cuando les toque pagar sus  deudas, todo lo que podrán hacer será farfullar.  Nosferatu: Forja una buena relación o te encontrarás arrastrado ante un Príncipe o Arzobispo  con ellos como testigos.  Ravnos: Lo siento, no acepto crédito. No de ti.  Toreador: ¡Clin, clin, clin!  Tremere: Uno de cada cien se da cuenta de lo que  podríamos hacer juntos. Los demás son unos estirados.  Tzimisce: El Dragón no es la única Serpiente  entre los Condenados.  Ventrue: Deja que nos odien en público mientras  sigan comprando.  Caitiff: ¡Cuán rápidamente se convierte a los maltratados!  Camarilla: La hipocresía es genial para los negocios.  Sabbat: Un paso adelante, dos pasos atrás, te prendes  fuego, te das una patada en el culo. Y luego te pavoneas.  Anarquistas: Un culto idealista a la personalidad  que a veces tiene éxito a pesar de sí mismo.  modo, pueden captar miembros de las poblaciones locales. El pelo rojo se considera una marca del favor de Set.");
        Toreador.setApariencia("Prácticamente todos son  atractivos de alguna manera, ya sea la belleza  tradicional de una modelo de pasarela o la  peligrosa atracción de algo más predatorio. Los Degenerados aumentan su  belleza física con un gran sentido  del estilo personal, que puede tomar la forma de carísima alta costura, ropa de calle vanguardista  o moda clásica diseñada para  resaltar sus seductoras cualidades. Esto no quiere decir que  no existan Toreador feos. De  hecho, aquéllos dotados de menor belleza física a menudo son  quienes van más allá en su elección de indumentaria.");
        Tremere.setApariencia(" Los Tremere  normalmente se presentan de  una de estas dos maneras:  un aspecto público tradicional y severo, o un semblante  mucho más arcano y apropiado  para ejercer sus hechicerías de  Sangre. Cuando están en  público o en eventos de  la Estirpe, los Tremere  optan por trajes y vestidos conservadores y tonos  neutros. Dentro de sus  Capillas o reunidos con  otros del Clan,  a menudo  prefieren  togas  decoradas con sutiles símbolos ocultistas  o atuendos con diversos  pliegues y bolsillos para  los extraños ingredientes de sus rituales.");
        Tzimisce.setApariencia(" Dada su habilidad para manipular su apariencia física mediante la Vicisitud, los Tzimisce tienen el  aspecto que desean, y a menudo buscan provocar o asustar.  Algunos prefieren modificar y experimentar de forma extrema con sus cuerpos hasta parecer sólo vagamente humanos.  Otros buscan redefinir o trascender los límites de sus formas, reconstruyéndose a imagen de ángeles, monstruos,  pesadillas y cosas aún menos  reconocibles.");
        Ventrue.setApariencia(" Los Ventrue prefieren las ropas  conservadoras y un aspecto discreto a no  ser que quieran hacer ostentación de  poder o dinero. Los Príncipes  Ventrue pueden llevar una  corona o portar un cetro  como símbolo de su posición, mientras que los jó-  venes Sangre Azul muestran  sus propios logros vía trajes,  corbatas, vestidos y accesorios  que fácilmente pasan desapercibidos por sí solos pero que se  suman a una apariencia imponente. Si un Ventrue tiene aunque sea un pelo fuera de sitio, es  porque ha pasado toda la noche  persiguiendo a la Sociedad de  Leopoldo y exigiendo la retirada de la amenaza del Sabbat.");

        Malkavian.setRefugio(" La coherencia es rara entre los Malkavian.  Para ser simples, establecen sus refugios donde creen  conveniente, donde pueden y donde son capaces de recordar. Un número significativo de ellos literalmente  no tienen hogar, pasando cada noche donde les permite  el cansancio o los rayos del Sol. Otros pueden ocupar  permanentemente la suite presidencial en un elegante  hotel, un piso okupado en los Yermos, el dispensario de la  prisión del condado o un cuarto de limpieza en un lugar  histórico emblemático.");
        Nosferatu.setRefugio(" Los Vástagos Nosferatu a menudo tienen sus  refugios lejos del desdén y el desprecio del resto de los vampiros. Tanto si construyen sus madrigueras en las alcantarillas que sugiere su apodo como si esculpen un vasto nido de pesadilla en lo alto del campanario de una iglesia en ruinas,  las Ratas de Alcantarilla valoran el secretismo y prefieren  estar en su refugios lejos de sus enemigos. Los Nosferatu de  comportamiento más humilde pueden ocultarse en un edificio abandonado en un callejón poco transitado. Mientras  esté lejos de los demás Vástagos, es un buen refugio.");
        Ravnos.setRefugio("Muchos Ravnos toman  la carretera en lugar de establecerse  en refugios permanentes, viviendo  temporalmente entre comunidades  itinerantes, en moteles de carretera o incluso en vehículos. Cuando  un Embustero echa raíces en un  dominio, su refugio permanente a  menudo está lejos de los territorios  de los Vástagos de las altas esferas.  Los refugios en guetos étnicos, suburbios industriales y lugares aislados son los más seguros y los que con  más frecuencia utilizan los Ravnos");
        Seguidores_de_Set.setRefugio(" Los Setitas establecen sus refugios, ya sean  individuales o comunales, allá donde estén sus templos  ocultos. Estos refugios pueden ser cualquier cosa desde  “iglesias” con denominaciones nunca antes oídas hasta  auténticos cultos que deben enmascarar su existencia. Las  sigilosas Serpientes a veces esconden refugios individuales en lugares donde otros Vástagos no suelen ir, como  aislados guetos étnicos, dominios abandonados, “la parte  mala de la ciudad” y lugares por el estilo. Algunos Setitas  también tienen refugios en lugares místicos secretos que  tienen valor para el Clan, ocultándolos de los extraños");
        Toreador.setRefugio(" Muchos Toreador provienen de la alta sociedad o de trasfondos “bohemios”. De hecho, muchos  son artistas, tienen influencia en la escena artística local  o en otras subculturas. Actores, cantantes, músicos, escultores, poetas, dramaturgos, escritores y personas creativas de cualquier clase pueden encontrar un hogar en  el Clan, así como aquéllos que sirven como mecenas (o  viajan como séquito) de estos artistas");
        Tremere.setRefugio(": Muchos Tremere dependen de una Capilla central que el Clan mantiene en ciudades en las que tiene una  presencia notable. Los Brujos más solitarios poseen refugios  privados, con todos los adornos que uno podría esperar de  un erudito de lo oculto, desde bibliotecas hasta laboratorios  alquímicos u observatorios en terrazas iluminadas por la luz  de la Luna e incluso siniestras mazmorras donde “sujetos de  estudio” viviseccionados se desangran siguiendo los experimentales estímulos controlados por el Tremere");
        Tzimisce.setRefugio(": Los  jóvenes  Tzimisce a  menudo  son Sacerdotes o  Ducti del  Sabbat, y  prefieren  mantener  Refugios  Comunales con sus manadas. Animan a sus compañeros a vivir en lugares aterradores, como bajo un hospital o morgue, o en  los fríos y húmedos escondrijos de un mausoleo. A veces,  los Antiguos del Clan tienen posesiones ancestrales en el  Viejo Mundo, y la imagen del vampiro en el castillo en  ruinas sobre una montaña escarpada debe mucho a los se-  ñores Tzimisce. Estas antiguas propiedades rara vez poseen  comodidades modernas, pero sus señores son extrañamente hospitalarios con los invitados (y terriblemente intolerantes con las molestias no invitadas).");
        Ventrue.setRefugio("El refugio de un Ventrue muestra tanto su gran poder  (léase: riqueza) como sus gustos  distinguidos. Opulento, grandioso,  incluso barroco: todo esto puede  aplicarse a un refugio Ventrue.  Huyen de lo ordinario que muestran otros Vástagos, y su estilo tiende menos a lo vanguardista que a lo  clásico y tradicional. Para los SanVAMPIRO LA MASCARADA EDICIÓN 20º ANIVERSARIO 73  Cita: No hay nada vergonzoso en hincar la rodilla ante alguien como yo,  así que paga tu puto tributo antes de que se me agote la paciencia.  gre Azul, un refugio bien mantenido es una extensión de  uno mismo, y para algunos cualquier cosa que no sea un  refugio en un estado impecable implica debilidad, distracción o incluso locura.");

        Malkavian.setCreacion("La coherencia es rara entre los Malkavian.  Para ser simples, establecen sus refugios donde creen  conveniente, donde pueden y donde son capaces de recordar. Un número significativo de ellos literalmente  no tienen hogar, pasando cada noche donde les permite  el cansancio o los rayos del Sol. Otros pueden ocupar  permanentemente la suite presidencial en un elegante  hotel, un piso okupado en los Yermos, el dispensario de la  prisión del condado o un cuarto de limpieza en un lugar  histórico emblemático.");
        Nosferatu.setCreacion(": Los Vástagos Nosferatu a menudo tienen sus  refugios lejos del desdén y el desprecio del resto de los vampiros. Tanto si construyen sus madrigueras en las alcantarillas que sugiere su apodo como si esculpen un vasto nido de pesadilla en lo alto del campanario de una iglesia en ruinas,  las Ratas de Alcantarilla valoran el secretismo y prefieren  estar en su refugios lejos de sus enemigos. Los Nosferatu de  comportamiento más humilde pueden ocultarse en un edificio abandonado en un callejón poco transitado. Mientras  esté lejos de los demás Vástagos, es un buen refugio");
        Ravnos.setCreacion(" Muchos Ravnos toman  la carretera en lugar de establecerse  en refugios permanentes, viviendo  temporalmente entre comunidades  itinerantes, en moteles de carretera o incluso en vehículos. Cuando  un Embustero echa raíces en un  dominio, su refugio permanente a  menudo está lejos de los territorios  de los Vástagos de las altas esferas.  Los refugios en guetos étnicos, suburbios industriales y lugares aislados son los más seguros y los que con  más frecuencia utilizan los Ravnos");
        Seguidores_de_Set.setCreacion("Los Sires escogen a quienes  demuestran pericia en Atributos Sociales y Mentales, ya  que el Clan necesita que sus proselitistas y sacerdotes sean  carismáticos y astutos. Los Conocimientos casi siempre  son primarios, aunque los Talentos también pueden serlo, especialmente entre aquellas Serpientes que suelan  hacer negocios. Los Setitas enfocan sus Trasfondos para  que les den influencia sobre otros ya sea sutil o abiertamente, lo que hace que Aliados, Contactos, Influencia,  Recursos y algunas veces Criados sean populares.");
        Toreador.setCreacion(" Los Atributos Sociales casi  siempre son los primarios, habiendo una división entre  Técnicas, Talentos y Conocimientos, dependiendo de  en qué destaque el Toreador. También les encanta cultivar Trasfondos. Aliados, Contactos, Dominio, Mentores, Recursos, Criados, Refugio... todos tienen un gran  valor para ellos. Los Toreador sensatos pueden escoger  desarrollar sus Virtudes, Humanidad, Senda o Fuerza de  Voluntad porque, con una vida de degeneración, frecuentemente deberán atender a la desagradable tarea de  mantener a la Bestia a raya");
        Tremere.setCreacion(" Los Atributos Mentales y los  Conocimientos son los que destacan entre los Tremere.  Muchos tienen un alto Coraje y Fuerza de Voluntad, pero  de alguna manera carecen de Conciencia o Convicción.  Suelen preferir los Trasfondos que mejoran su relación  con el Clan, como Mentor, Estatus y Criados (que un  Brujo hábil puede crear a partir de componentes inertes).");
        Tzimisce.setCreacion(" Pocos Tzimisce conocen la  moderación, y de esa manera a menudo prefieren los  Atributos Físicos o los Mentales, teniendo por lo general  uno de los Rasgos extraordinariamente alto. Suelen preferir los Conocimientos, aunque las Técnicas también  son apreciadas. Mentor, Aliados, Dominio y Criados son  bastante apropiados para ellos, así como unas pocas (casi  hiperdesarrolladas) Disciplinas. Sus extrañas mentalidades a menudo los llevan a seguir Sendas de Iluminación.  Las abominaciones a las que la mayoría de los Tzimisce  a menudo se ven expuestos durante sus años como Reto-  ños a veces provocan complicados Trastornos");
        Ventrue.setCreacion("Los Ventrue suelen tener arquetipos de personalidad extrovertidos y controladores. Los  miembros del Clan Ventrue prefieren los Atributos Mentales y Sociales, pero cualquier categoría de Habilidades puede ser la primaria, dependiendo de la experiencia personal.  Los Trasfondos pueden ser o muy variados o elevados entre los Ventrue, y casi todos los Sangre Azul poseen cierta  cantidad de Recursos, Estatus y Rebaño (particularmente  el último, dada la Debilidad del Clan). Los Antiguos en  particular poseen envidiables refugios y amplios Dominios");

        Malkavian.setDebilidad("Todos los miembros del Clan Malkavian  sufren un Trastorno incurable y permanente. Pueden adquirir y recuperarse de cualquier otro Trastorno, y pueden gastar Fuerza de Voluntad para aminorar los efectos  del Trastorno durante una escena, pero nunca pueden  recuperarse por completo de su Trastorno original");
        Nosferatu.setDebilidad("Todos los Nosferatu tienen una puntuación de Apariencia de cero y nunca pueden mejorarla.  Táchala de la hoja de personaje. Las tiradas que utilicen el Rasgo de Apariencia son inherentemente difíciles  para estos horrendos Vástagos");
        Ravnos.setDebilidad("Una historia turbulenta hace a los  Ravnos esclavos de sus vicios. Cada Ravnos siente inclinación por un tipo de vicio (por ejemplo, la mentira,  la crueldad o el robo). Cuando se le presenta la oportunidad de caer en ese vicio, el Ravnos debe satisfacerlo a  menos que su jugador supere una tirada de Autocontrol  o Instinto (dificultad 6).");
        Seguidores_de_Set.setDebilidad(" Dados sus orígenes en la oscuridad, las Serpientes reaccionan negativamente a la luz brillante: añade  dos niveles al daño causado por la exposición a la luz solar.  Los Setitas también pierden un dado de sus reservas para  las acciones que realicen bajo luces brillantes (luces de policía, iluminación de escenarios, bengalas, etc).");
        Toreador.setDebilidad("Cuando un Toreador experimenta algo  realmente extraordinario (una persona, un objet d’art,  un bello amanecer), el jugador debe hacer una tirada  de Autocontrol o Instinto (dificultad 6). El fallo significa que el Vástago se ve cautivado por la experiencia.  El fascinado Toreador no podrá actuar durante el resto  de la escena excepto para comentar o continuar inmerso  en lo que sea que haya captado su atención. Si la experiencia deja de afectarlo (ya sea por haberse desplazado o  por haber resultado destruida, o cualquier otra cosa que  sea apropiada en la situación), la fascinación termina.  Los Toreador embelesados no pueden defenderse si los  atacan, aunque si los hieren pueden volver a hacer una  tirada de Autocontrol o Instinto");
        Tremere.setDebilidad("La dependencia de Sangre de los Tremere es incluso más pronunciada que la de otros Vástagos.  Sólo son necesarios dos tragos de la Sangre de otro vampiro para que un Tremere quede Vinculado en lugar de  los tres normales: la primera vez cuenta como si el Tremere hubiera bebido dos veces (Para más información  acerca del Vínculo de Sangre, ver pág. 299). Los Antiguos del Clan son muy conscientes de esto y buscan imponer lealtad en el Clan forzando a los Brujos Neonatos  a beber la Sangre (transustanciada) de los siete Antiguos  Tremere poco después de su Abrazo");
        Tzimisce.setDebilidad(" Los Tzimisce están inextricablemente  unidos a sus dominios de origen, y deben descansar en la  proximidad de al menos dos puñados de “tierra nativa”  (tierra de un lugar importante para él como mortal, como  el lugar donde nació o el cementerio donde fue Abrazado). Cada noche que pase sin esta conexión física con  su tierra reduce todas las reservas de dados a la mitad, de  forma acumulativa, hasta que sólo le quede un dado en la  reserva. La penalización permanece hasta que descanse  un día completo rodeado de su tierra una vez más");
        Ventrue.setDebilidad(" Los Ventrue tienen gustos refinados, y sólo  un tipo específico de sangre mortal les resulta aceptable y  necesaria. Cuando un jugador crea un personaje Ventrue,  debe decidir con el Narrador qué tipo específico de sangre  alimenta al personaje, y esta elección es permanente. La  sangre de otros tipos (incluso de animales) sencillamente  no aumenta su reserva de Sangre, independientemente de  cuánta consuma: la vomita sin más. Este refinado paladar  puede ser muy amplio o muy restrictivo; por ejemplo, la  sangre de hermanas menores, o la sangre de niños desnudos. La Sangre vampírica está exenta de esta restricción.");

        Malkavian.setOrganizacion("Hay más rumores que verdad en lo que  concierne a la organización de los Malkavian, y circulan  todo tipo de historias horribles que describen el funcionamiento del Clan. Unos dicen que todos los Lunáticos  comparten una mente de colmena; otros proclaman que  de hecho es la persistente consciencia del progenitor del  Clan, Malkav. Incluso algunos dicen que una red de locura pone a todos los Malkavian en contacto entre ellos y  que es la causa de su incapacitante demencia. Por encima  de todo, los Malkavian demuestran ser inescrutables e inesperados. Una noche, todos ellos caen en Frenesí al verse  unos a otros, mientras que a la siguiente todos convergen  a la vez en el refugio del Sheriff y lo acusan de amparar a  espías del Sabbat. ¿Quién sabe cómo se extiende la “enfermedad de la información” o las costumbres del Clan");
        Nosferatu.setOrganizacion(" Ocasionalmente, una coterie de Nosferatu se convierte en una hermandad o en un culto, por lo  general fundadas en torno a una remota madriguera. Estas  coteries pueden extenderse formando vastos “reinos” de  Ratas de Alcantarilla, que normalmente existen sin el conocimiento del Príncipe o Arzobispo de un dominio. Los  Nosferatu están entre los Vástagos que con más frecuencia comparten un refugio comunal, aunque sólo sea por la  protección que confiere el número. Asimismo, los Nosferatu comparten información entre ellos a través de otras  redes (ya sean digitales, personales, ocultas o algo menos  definible) que desafían la comprensión de otros Vástagos.");
        Ravnos.setOrganizacion(" Los Ravnos son un Clan muy diseminado, con poco en común y la clara constatación de que  cada Embustero mira primero por sus propios intereses.  Dicho esto, a los Ravnos les gusta exagerar la camaradería y el ritual cultural del Clan, incluso aunque sepan que  las promesas que se hacen son tan efímeras como los susurros en el viento nocturno. Se sabe que los Embusteros  se han aliado contra enemigos comunes como Príncipes  tiránicos o matanzas del Sabbat, pero estas alianzas se  extinguen rápidamente una vez la amenaza desaparece.");
        Seguidores_de_Set.setOrganizacion("La organización de los Setitas en su  mayoría es local, representando un templo o una red de  cultos la presencia de las Serpientes en la ciudad. Los Setitas en las ciudades raramente hacen planes contra otros  de los suyos, prefiriendo encarar las amenazas externas  en unidad en lugar del cismático egoísmo de las Sectas.  Persisten los rumores acerca de un gigantesco templo dedicado a Set localizado en algún lugar de África, cuyo  líder es un terrible Matusalén que afirma ser Chiquillo  del propio Set. Si esto es cierto, entonces los planes ocultos del Clan probablemente se originen aquí, aunque los  Setitas guardan silencio sobre el tema");
        Toreador.setOrganizacion(": En sus dominios locales, el Clan Toreador es exclusivo y cerrado, pero muy raramente hasta el  punto de afectar a sus costumbres. Ciertos Toreador (y  unos pocos de fuera del Clan) usan el término “Artiste” y  “Poseur” cuando describen a un determinado Toreador, a  menudo burlonamente, para indicar si el Degenerado en  cuestión es considerado como alguien creativo o, simplemente, un seguidor de las tendencias establecidas. En cualquier caso, se trata de una distinción informal");
        Tremere.setOrganizacion("La seña de identidad del Clan Tremere  es “la Pirámide”, la rígida jerarquía que gobierna al Clan  y lo convierte en el más organizado de todos los linajes de  los Vástagos. Con muchos niveles de membresía, facciones  internas y círculos de misterio, la jerarquía de los Tremere  presenta un frente unificado hacia el exterior, y una unidad interna semejante entre bastidores. Aun así, la Pirámide inculca una más que razonable dosis de paranoia, ya que  tanto los Brujos rebeldes como un competitivo ambiente  de ocultismo académico enfrentan a los acólitos unos contra otros en pos de los mayores logros para el Clan.");
        Tzimisce.setOrganizacion("Los Demonios son, en general, desconfiados con el resto de Vástagos, especialmente con los de  su propio Clan. Por ello, la organización de los Tzimisce,  como tal, valora mucho la soledad. Va contra su naturaleza ser sociables, y eso hace que deban esforzarse para ser  Sabbat (aunque esto es menos difícil para los Tzimisce  más jóvenes de actitudes algo más modernas). Ésta es la  razón clave por la que tantos siguen Sendas de Iluminación: para dar propósito a su xenofobia, pero también  para darles un punto de referencia en común con otros  que siguen su misma Senda.");
        Ventrue.setOrganizacion(": La organización del Clan es local y feudal, contando con varios niveles de títulos de nobleza, vasallajes, juramentos de lealtad y de favores que reemplazan a una rígida jerarquía. Muchos Ventrue se presentan  como los amos secretos de sus dominios, consolidando su  poder en duraderas redes y organizando conspiraciones.  Los Ventrue valoran enormemente la propiedad y el honor, y utilizan muchos tratamientos de cortesía y respeto;  sus Leyes del Decoro son complejas y rígidas, y podrían  llenar varios volúmenes. Casi todos los Ventrue dignos  de su posición pueden recitar su linaje al menos hasta sus  Antiguos, si no hasta los grandes Matusalenes.");

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
        fisicos.add(new Meritos_Defectos(f, "Ambidiestro", "Tienes un alto grado de destreza en la mano torpe y puedes realizar acciones con la mano “mala” sin penalización  alguna. Las reglas para realizar acciones múltiples aún se  aplican, pero no sufres ningún penalizador a la dificultad  si usas dos armas o te ves forzado a utilizar tu mano torpe", 1));
        fisicos.add(new Meritos_Defectos(f, "Cara Amistosa", "Tienes una cara que a todo el mundo le recuerda a  alguien, hasta el punto que los extraños se ven inclinados a tu favor por ello. El efecto no se desvanece incluso  si explicas su “error”, lo que te proporciona un –1 a la  dificultad en todas las tiradas Sociales apropiadas (válido para Seducción, por ejemplo, pero no para Intimidación) cuando hay un extraño. Este Mérito sólo funciona  la primera vez que te encuentras con alguien", 1));
        fisicos.add(new Meritos_Defectos(f, "Comer Comida", "Tienes la capacidad de comer comida e incluso de saborearla. Aunque no puedes obtener alimento de comidas normales, esta habilidad te servirá para fingir que eres  humano. Por supuesto, no puedes digerir lo que comes,  y en algún momento de la noche tendrás que vomitarlo.", 1));
        fisicos.add(new Meritos_Defectos(f, "Equilibrio Felino", "Posees un sentido del equilibrio innato y perfecto. Los  personajes con este Mérito reducen las dificultades de  todas las acciones relacionadas con el equilibrio (por  ejemplo: Destreza + Atletismo para caminar por superficies estrechas) en dos", 1));
        fisicos.add(new Meritos_Defectos(f, "Madrugador", "Nadie puede explicarlo, pero pareces tener la habilidad para continuar en movimiento con menos descanso  que el resto de los vampiros. Siempre pareces ser el primero en levantarse y el último en irse a dormir, incluso  aunque estés despierto hasta después del alba. Se considera que tu puntuación de Humanidad o de Senda es de  10 para el propósito de decidir cuándo te levantas cada  noche. Los vampiros con este Mérito no pueden tener el  Defecto Sueño Profundo", 1));
        fisicos.add(new Meritos_Defectos(f, "Maton", "Tu apariencia de gorila inspira miedo (o al menos inquietud) en aquéllos que te ven. Aunque no tienes que  ser feo por fuerza, irradias una silenciosa amenaza, hasta  el punto en que la gente cruza la calle para evitar pasar cerca de ti. Todas las tiradas de Intimidación contra  aquéllos que no han demostrado su superioridad física  sobre ti, tienen un –1 de dificultad.", 1));
        fisicos.add(new Meritos_Defectos(f, "Sentido Agudo", "Uno de tus sentidos está excepcionalmente desarrollado, ya sea la vista, el oído, el olfato, el tacto o el  gusto. Las dificultades para las acciones que tengan que  ver con ese sentido en particular se reducen en dos.  Este Mérito puede combinarse con la Disciplina Auspex para producir efectos de agudeza sensorial sobrehumana", 1));
        fisicos.add(new Meritos_Defectos(f, "Color Saludable", "Pareces más saludable que el resto de los vampiros,  lo que te permite mezclarte en la sociedad humana  mucho más fácilmente. Aún conservas el color de  un mortal vivo y tu piel sólo está ligeramente fría al  tacto", 2));
        fisicos.add(new Meritos_Defectos(f, "Voz Encantadora", "Hay algo en tu voz que los demás no pueden ignorar.  Cuando das órdenes, los sometes. Cuando seduces, se  quedan embelesados. Ya sea atronadora, relajante, persuasiva o simplemente agradable, tu voz exige atención.  Las dificultades de todas las tiradas que tengan que ver  con el uso de la voz para persuadir, convencer o dar órdenes se reducen en dos", 2));
        fisicos.add(new Meritos_Defectos(f, "Digestion Eficiente", "Puedes conseguir más cantidad de alimento del habitual de la sangre. Cuando te alimentes, ganas un punto  adicional en tu reserva de Sangre por cada dos puntos de  Sangre que consumas. Esto no te permite sobrepasar el  máximo de tu reserva de Sangre.", 3));
        fisicos.add(new Meritos_Defectos(f, "Temerario", "Eres bueno asumiendo riesgos y aún mejor sobreviviendo a ellos. Cuando intentan acciones excepcionalmente  arriesgadas fuera de situaciones de combate (como saltar  de un coche en movimiento a otro), los personajes con  este Mérito añaden tres dados adicionales a sus tiradas e  ignoran un único dado de fracaso del resultado. Generalmente, estas acciones deben tener una dificultad mínima  de 8 y el potencial de infligir al menos tres niveles de  Salud de daño si fallan.", 3));
        fisicos.add(new Meritos_Defectos(f, "Corpulento", "Eres anormalmente grande, al menos dos metros diez  y más de 130 kilos (6’10” y 300 libras). Además de ser  extraordinariamente visible en público, esta masa adicional te concede un nivel de Salud Magullado adicional. Los personajes con este Mérito ganan también bonificaciones para empujar objetos, abrir puertas cerradas,  evitar ser derribados, etc", 4));
        return fisicos;
    }

    public static ArrayList<Meritos_Defectos> Defecto_F() {
        ArrayList<Meritos_Defectos> fisicos = new ArrayList<>();
        String f = "Fisicos";
        fisicos.add(new Meritos_Defectos(f, "Bajo", "Estás bastante por debajo de la altura media, metro y  medio o menos (cuatro pies y medio). Tienes dificultades para alcanzar o manejar objetos diseñados para una  talla de adulto normal, y tu velocidad de carrera es la  mitad de la de alguien de tu edad", 1));
        fisicos.add(new Meritos_Defectos(f, "Duro de oido", "Tu oído es defectuoso. La dificultad de cualquier tirada  que tenga que ver con el sentido del oído aumenta en dos", 1));
        fisicos.add(new Meritos_Defectos(f, "Olor de la tumba", "Exudas un olor a humedad y a tierra removida que  ninguna cantidad de perfume puede cubrir. Los mortales  en tu presencia inmediata se sienten incómodos, así que  todas las dificultades para las tiradas Sociales para afectar  a mortales aumentan en uno", 1));
        fisicos.add(new Meritos_Defectos(f, "Tic", "Haces algún tipo de movimiento repetitivo en momentos de estrés, que supone una seña identificativa.  Una tos nerviosa, frotar las manos continuamente, crujir los nudillos, son ejemplos de estos tics. Te cuesta un  punto de Fuerza de Voluntad evitar caer en tu tic.", 1));
        fisicos.add(new Meritos_Defectos(f, "Defecto Visual", "Tu vista es defectuosa. Las dificultades para cualquier  tirada que tenga que ver con la vista se incrementan en  dos. Con el Defecto de un punto, la condición puede  corregirse usando gafas o lentillas; con la versión de tres  puntos del Defecto, la condición es demasiado severa  como para corregirse", 1));

        fisicos.add(new Meritos_Defectos(f, "Defecto Visual", "Tu vista es defectuosa. Las dificultades para cualquier  tirada que tenga que ver con la vista se incrementan en  dos. Con el Defecto de un punto, la condición puede  corregirse usando gafas o lentillas; con la versión de tres  puntos del Defecto, la condición es demasiado severa  como para corregirse", 3));
        fisicos.add(new Meritos_Defectos(f, "Desfigurado", "Una horrible deformidad hace que tu apariencia sea  incómoda y memorable. Las dificultades de todas las tiradas que tengan que ver con las interacciones sociales  aumentan en dos. No puedes tener una puntuación de  Apariencia mayor de dos.", 2));
        fisicos.add(new Meritos_Defectos(f, "Decimocuarta Generación", "Fuiste creado hace cuatro o cinco años por un miembro  de la Decimotercera Generación. Aunque tienes 10 puntos de Sangre en tu cuerpo, sólo puedes usar ocho de ellos  para curarte, potenciar Disciplinas, aumentar Atributos,  etc. Aún puedes usar esos dos puntos finales para otros  propósitos. El coste de puntos de Sangre para levantarse  cada noche, crear y mantener Ghouls, y crear Vínculos  de Sangre es igual que el del resto de vampiros. No puedes  tener ninguna Disciplina por encima de cuatro puntos.  Tomar este Defecto te impide adquirir el Trasfondo  Generación y tampoco puedes empezar con Estatus. Seguramente seas un Caitiff sin Clan, ya que tu Sangre será  demasiado Débil para transmitir características distinguibles de un Clan. La mayor parte de vampiros de Decimocuarta Generación deberían de escoger el Defecto  Sangre Débil", 2));
        fisicos.add(new Meritos_Defectos(f, "Desfigurado", "Una horrible deformidad hace que tu apariencia sea  incómoda y memorable. Las dificultades de todas las tiradas que tengan que ver con las interacciones sociales  aumentan en dos. No puedes tener una puntuación de  Apariencia mayor de dos.", 2));
        fisicos.add(new Meritos_Defectos(f, "Mordisco Débil", "Por alguna razón tus colmillos nunca se desarrollaron  completamente, o puede que ni siquiera se hayan manifestado en absoluto. Cuando te alimentes, necesitas encontrar otra manera de hacer fluir la sangre. Si no tienes  éxito, debes conseguir el doble de éxitos para que tu mordisco penetre en la carne adecuadamente. Muchos Caitiff  y vampiros de Generación alta manifiestan este Defecto.", 2));
        fisicos.add(new Meritos_Defectos(f, "Mordisco Infeccioso", "No puedes cerrar las heridas causadas cuando te alimentes lamiéndolas. De hecho, tu mordisco tiene una  posibilidad de cada cinco de infectarse y causar a la víctima mortal una enfermedad grave. La naturaleza especí-  fica de la infección es decisión del Narrador.", 2));
        fisicos.add(new Meritos_Defectos(f, "Tuerto", "Tienes sólo un ojo, el ojo que te falta es decisión tuya.  Las dificultades de todas las tiradas de Percepción que  tengan que ver con la vista se incrementan en dos, y las  dificultades de todas las tiradas que tengan que ver con la  profundidad de percepción se incrementan en uno (esto  incluye el combate a distancia)", 2));
        fisicos.add(new Meritos_Defectos(f, "Vulnerabilidad a la Plata", "Para ti, la plata es dolorosa y tan mortal como los rayos  del Sol. Sufres heridas agravadas de cualquier arma de  plata (balas, cuchillos, etc), y el mero toque de los objetos de plata te incomoda.", 2));
        fisicos.add(new Meritos_Defectos(f, "Herida Abierta", "Tienes una o más heridas que rehúsan curarse y que  constantemente rezuman Sangre. Esta lenta pérdida te  cuesta un punto de Sangre adicional cada noche (que  se marca justo antes del alba), además de llamar la atención. Si la herida es visible, tienes un +1 de dificultad a  las tiradas Sociales. Por dos puntos, el Defecto es simplemente poco visible y tiene los efectos básicos anteriormente citados; por cuatro puntos, la herida sangrante es  seria o causa una deformidad que incluye los efectos del  Defecto Herida Permanente (más adelante)", 2));
        fisicos.add(new Meritos_Defectos(f, "Herida Abierta", "Tienes una o más heridas que rehúsan curarse y que  constantemente rezuman Sangre. Esta lenta pérdida te  cuesta un punto de Sangre adicional cada noche (que  se marca justo antes del alba), además de llamar la atención. Si la herida es visible, tienes un +1 de dificultad a  las tiradas Sociales. Por dos puntos, el Defecto es simplemente poco visible y tiene los efectos básicos anteriormente citados; por cuatro puntos, la herida sangrante es  seria o causa una deformidad que incluye los efectos del  Defecto Herida Permanente (más adelante)", 4));
        fisicos.add(new Meritos_Defectos(f, "Adicción", "Sufres de adicción a una sustancia que debe estar presente en la sangre que bebes (o entras en Frenesí automáticamente, como en el Defecto Exclusión de Presa).  Puede ser alcohol, nicotina, drogas duras o simplemente  adrenalina. Esta sustancia siempre te perjudica ", 3));
        fisicos.add(new Meritos_Defectos(f, "Cojo", "Tus piernas están dañadas, lo que te impide correr e  incluso caminar fácilmente. Debes caminar con un bastón o puede que con muletas, y tienes una cojera pronunciada al caminar. Tu velocidad al andar es un cuarto  de la de un humano normal, y correr resulta imposible.", 3));
        fisicos.add(new Meritos_Defectos(f, "Colmillos Permanentes", "Tus colmillos no se retraen, lo que hace que resulte  imposible ocultar tu naturaleza. Aunque algunos mortales pueden pensar que has afilado tus dientes o que llevas prótesis, tarde o temprano encontrarás a alguien que  sepa lo que eres realmente. Además, estás limitado a tres  puntos en tu Apariencia", 3));
        fisicos.add(new Meritos_Defectos(f, "Curación Lenta", "Tienes dificultad para curar tus heridas. Se requieren  dos puntos de Sangre para curar un nivel de Salud de daño  contundente o letal, y curas un nivel de Salud de daño  agravado cada cinco días (además del gasto habitual de  cinco puntos de Sangre y uno de Fuerza de Voluntad).", 3));
        fisicos.add(new Meritos_Defectos(f, "Deformidad", "Tienes algún tipo de deformidad (un brazo atrofiado,  una joroba o un pie zambo, por ejemplo) que te afecta en tus habilidades físicas e interacciones con otros.  Una joroba, por ejemplo, disminuiría la Destreza en dos  y aumentaría la dificultad de las tiradas sociales en uno.  Es responsabilidad del Narrador determinar los efectos  específicos de la deformidad escogida.", 3));
        fisicos.add(new Meritos_Defectos(f, "Herida Permanente", "Sufriste heridas durante el Abrazo que tu transformación no consiguió reparar. Al principio de cada noche,  te alzas del sueño en el nivel de Salud Herido, aunque  puede sanarse gastando puntos de Sangre.", 3));
        fisicos.add(new Meritos_Defectos(f, "Monstruoso", "Tu forma física se dañó durante el Abrazo y ahora refleja la Bestia que ruge dentro de ti. Los personajes con  este Defecto parecen monstruos salvajes y tienen Apariencia cero. Los Nosferatu y otras Líneas de Sangre cuya Debilidad les cause empezar con Apariencia cero no  pueden escoger este Defecto", 3));
        fisicos.add(new Meritos_Defectos(f, "niño", "Eras un niño pequeño (entre cinco y diez años) cuando te Abrazaron, lo que dejó tus Atributos Físicos subdesarrollados y te dificulta a la hora de interactuar con  determinados aspectos de la sociedad mortal. No puedes  tener más de dos puntos en Fuerza o Resistencia durante  la creación de personaje, excepto cuando aumentes los  Atributos Físicos con puntos de Sangre, y las dificultades  de todas las tiradas de dados para tratar de dirigir o dar órdenes a adultos mortales aumentan en dos. Los personajes  con este Defecto deberían tener el Defecto Bajo también", 3));
        fisicos.add(new Meritos_Defectos(f, "Ojos Brillante", "Tienes los estereotípicos ojos brillantes de los vampiros de las leyendas, lo que te da un –1 de dificultad en  las tiradas de Intimidación cuando trates con mortales.  Sin embargo, las desventajas son muchas; debes esconder constantemente esa condición (no, las lentillas no la  ocultan); el brillo entorpece tu visión y te da un +1 a la  dificultad en todas las tiradas que tengan que ver con la  vista (incluyendo armas a distancia); y el brillo que emana de tus ojos hace difícil que te ocultes en la oscuridad  (+2 a la dificultad de las tiradas de Sigilo)", 3));
        fisicos.add(new Meritos_Defectos(f, "Perezoso", "Simplemente eres vago, evitas todo lo que requiera un  esfuerzo por tu parte. Prefieres que otros hagan el trabajo  duro y simplemente pasas el rato. Para cualquier acción  que requiera preparación, existe una gran probabilidad  de que no lo hayas hecho adecuadamente. La dificultad  de las tiradas para acciones Físicas espontáneas (lo que  incluye el combate a no ser que sea parte de una ofensiva  planeada) se incrementa en uno", 3));
        fisicos.add(new Meritos_Defectos(f, "Decimoquinta Generación", "Tu Vitae es tan Débil que sólo puedes utilizar 6 de los  10 puntos de tu reserva de Sangre para usar Disciplinas,  curarte o aumentar Atributos. Para estas funciones, debes gastar dos puntos de Sangre para obtener los mismos  resultados que un vampiro normal obtendría gastando  sólo uno (el coste para levantarse cada noche permanece en un punto de Sangre). Es más, no puedes crear ni  mantener Ghouls, crear Vínculos de Sangre o engendrar  Chiquillos vampíricos. Puedes utilizar el resto de tus  puntos de Sangre para sobrevivir durante el día y levantarte cada noche, nada más.  No puedes subir ninguna Disciplina por encima de tres  puntos. El debilitamiento de la Maldición de Caín tiene sus  beneficios a pesar de todo (lo que distingue este Defecto  del de Sangre Débil). La luz del Sol causa daño letal, en  lugar de daño agravado como lo hace al resto de vampiros. Puedes mantener comida y bebida mortal en tu estómago durante aproximadamente una hora; otros vampiros la vomitan inmediatamente (a no ser que tengan  el Mérito Comer Comida). Y lo más extraño de todo,  eventualmente puedes engendrar de la manera normal,  mortal… aunque no será un niño humano normal", 4));
        fisicos.add(new Meritos_Defectos(f, "Mudo", "No puedes hablar. Puedes comunicarte con el Narrador  y describir tus acciones, pero no puedes hablar con los  demás personajes, jugadores o del Narrador, a no ser que  todos los que se comuniquen conozcan la lengua de signos (a través del Mérito Idioma) o escribas lo que dices.", 4));
        fisicos.add(new Meritos_Defectos(f, "Portador de Enfermedad", " Tu Sangre porta una enfermedad altamente contagiosa  y letal. Esta enfermedad puede ser cualquier cosa desde la  rabia al VIH, y los Vástagos que beben tu Sangre tienen  un 10% de probabilidad de convertirse en portadores a  su vez. Debes gastar un punto de Sangre adicional cada  noche al despertar o empezarás a manifestar los síntomas  de la enfermedad (mayor probabilidad de Frenesí por la  rabia, tiradas de absorción reducidas con VIH, etc).", 4));
        fisicos.add(new Meritos_Defectos(f, "Sangre Débil", "Tu Vitae está diluída, y no te mantiene correctamente. Todos los gastos de puntos de Sangre se doblan (por  ejemplo: utilizar Disciplinas relacionadas con la Sangre,  curar daño), aunque sólo pierdes un punto de Sangre al  alzarte cada noche. Además, no puedes crear Vínculos  de Sangre, y sólo tienes éxito una vez de cada cinco al  tratar de engendrar Progenie.", 4));
        fisicos.add(new Meritos_Defectos(f, "Sordo", "No puedes oír. Aunque puedes ser más resistente a algunas aplicaciones de Dominación, no puedes escuchar  medios vocales o electrónicos, y las dificultades de las  tiradas de Percepción se incrementan en tres.", 4));
        fisicos.add(new Meritos_Defectos(f, "Carne Cadavérica", "Tu carne no se regenera completamente cuando recibe  daño. Aunque eres capaz de curarte hasta el punto de recuperar la funcionalidad plena, tu piel mantiene los cortes, arañazos, agujeros de bala y otros daños visibles que  haya sufrido. Dependiendo de la naturaleza del daño,  este Defecto hará que las acciones sociales sean difíciles  en extremo y puede hacer descender la puntuación de  Apariencia con el tiempo (incluso hasta 0)", 5));
        fisicos.add(new Meritos_Defectos(f, "Vitae Estéril", "Durante tu Abrazo algo fue horriblemente mal, lo que  causó que tu Sangre mutara debido al estrés de morir  y alzarte de nuevo. Todos aquellos a quienes tratas de  Abrazar mueren. No importa lo que hagas, no puedes  engendrar Progenie. Sin embargo, tu Sangre aún puede  utilizarse en rituales de Sangre como la Taumaturgia o  la Vaulderie, o en cualquier otra necesidad vampírica  como crear Ghouls", 5));
        fisicos.add(new Meritos_Defectos(f, "Ciego", "No puedes ver. Los personajes pueden compensar la  pérdida de visión al hacerse más sensibles a otros estímulos sensoriales, pero las pistas e imágenes visuales son inaccesibles para ellos. La dificultad de todas las tiradas de  Destreza aumentan en dos. Extrañamente, los vampiros  con Percepción del Aura (Auspex 2) aún pueden utilizar  esa habilidad, aunque la información se interpreta por  medio de otros sentidos. Por otro parte, los vampiros que  necesitan mantener contacto visual para utilizar Poderes tales como Dominación sufren una penalización para  usarlos contra ti ", 6));

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
        Trasfondos.add(new Trasfondo(0, "Aliados", "Los Aliados son mortales que te apoyan y ayudan: familiares, amigos o incluso una organización mortal que  te debe lealtad. Aunque te ayuden voluntariamente, sin  coacción o coerción, no están siempre disponibles para  ofrecer asistencia; tienen sus propias preocupaciones y  hacen cuanto pueden por el bien de vuestra relación.  Sin embargo, podrían tener Rasgos de Trasfondos útiles  propios, y podrían proveerte con acceso indirecto a sus  Contactos, Influencia o Recursos.  Los Aliados son a menudo personas influyentes y con  poder en tu ciudad natal. Pueden ser de casi cualquier  clase dependiendo de lo que tu Narrador permita. Puedes  tener amigos en el depósito de cadáveres de la policía, en  un blog destacado, entre la alta sociedad de celebridades  locales o en una obra. Tus Aliados podrían ser un clan de  nómadas que trasladan su hogar móvil por la zona o una  familia con generaciones y generaciones de policías. Podrías contar incluso al mismísimo alcalde entre tus amigos dependiendo de cuántos puntos gastes en este Rasgo.  Tus Aliados son generalmente de fiar (aunque probablemente no sepan que eres un vampiro, o que siquiera  existan). Sin embargo, nada es gratis. Si acabas pidiendo  favores de tu amigo en la Cosa Nostra, es probable que  igualmente te pida que le hagas un favor en el futuro.  Esto casi siempre provoca el inicio de una historia...  Aliados puede ser Compartido por una coterie de personajes.  • Un aliado de influencia y poder moderados.  •• Dos aliados, ambos de poder moderado.  ••• Tres aliados, uno de los cuales es bastante influyente.  •••• Cuatro aliados, uno de los cuales es  muy influyente.  ••••• Cinco aliados, uno de los cuales es  extremadamente influyente"));
        Trasfondos.add(new Trasfondo(0, "Contactos", "Conoces a gente por toda la ciudad. Cuando empiezas a hacer llamadas a través de tu red, la cantidad de  información que puedes obtener es impresionante. Más  que amigos a los que puedes requerir ayuda, como los  Aliados, los Contactos son sobre todo gente a la que  pagas, manipulas o coaccionas para que te ofrezcan información. Puedes también tener unos pocos contactos  principales, asociados que te dan información precisa  dentro de sus ámbitos de conocimiento. Deberías describir cada contacto principal en detalle antes de comenzar a jugar.  Además de tus contactos principales, también puedes  tener un número de contactos menores desplegados por  toda la ciudad. Tu contacto principal podría estar en la  oficina del fiscal del distrito, mientras los menos importantes podrían incluir policías quemados, empleados de  tráfico, porteros de discoteca o miembros de una red social en Internet. No necesitas detallar estos “conocidos  fugaces” antes de jugar. En vez de eso, para contactar satisfactoriamente con un contacto menor, tirarías tu puntuación de Contactos (dificultad 7). Puedes hacer uso  de un contacto menor por cada éxito. Por supuesto, aún  tienes que convencerlos para que te den la información  que necesites, asumiendo que la tengan.  Contactos puede ser Compartido entre los personajes  de una coterie.  • Un contacto principal.  •• Dos contactos principales.  ••• Tres contactos principales.  •••• Cuatro contactos principales.  ••••• Cinco contactos principales."));
        Trasfondos.add(new Trasfondo(0, "Criados", "Sin ser precisamente Aliados o Contactos, tus Criados  son sirvientes, asistentes u otras personas que sean tus  constantes y leales ayudantes. Muchos siervos de vampiros son Ghouls (ver pág. 496): sus Poderes sobrenaturales  y su lealtad forzada por el Vínculo de Sangre los convierten en los sirvientes preferidos por ellos. También  podrían ser personas a quienes hayas Dominado repetidamente hasta que no les queda voluntad alguna o seguidores tan fascinados con tu Presencia que su lealtad raya  en el fanatismo ciego. Algunos vampiros, especialmente  aquéllos con la Disciplina Animalismo, emplean animales Ghouls como Criados.  Debes mantener algún control sobre tus criados; ya sea  mediante un salario, el don de tu Vitae o el uso de Disciplinas. Los criados nunca son “ciegamente leales pase lo  que pase”: si los tratas mal sin ejercer un control estricto,  podrían volverse contra ti.  Los Criados pueden ser útiles, pero nunca perfectos.  Un Ghoul físicamente potente podría ser rebelde, inconvenientemente torpe o carente de capacidades prácticas. Un mayordomo leal podría ser físicamente débil o  carecer de iniciativa o creatividad propias. Este Trasfondo no es una excusa para crear un guardaespaldas imparable o un asesino a modo de mascota: es un método para  incorporar más personajes totalmente desarrollados a la crónica, así como para reflejar a los seguidores por los  que los Vástagos son tristemente célebres. En general,  los criados se parecen más a Renfield que a Anita Blake.  (Si jugador y Narrador están de acuerdo, el primero podría crear un único Criado más competente combinando  más puntos en este Trasfondo, poniendo más huevos en la  misma cesta, como se suele decir).  Los jugadores pueden emplear puntos de Trasfondos  Compartidos en Criados.  • Un criado.  •• Dos criados.  ••• Tres criados.  •••• Cuatro criados.  ••••• Cinco criados"));
        Trasfondos.add(new Trasfondo(0, "Dominio", "Dominio es un territorio físico (normalmente dentro de la ciudad principal de la crónica) cuyo acceso a  efectos de alimentación controla tu personaje. Algunos  Vástagos se refieren a sus dominios como territorios de  Caza, y la mayoría los protege celosamente, invocando  incluso la Tradición del mismo nombre para defender  sus reclamaciones. Como parte de este Trasfondo, la reclamación del personaje sobre el dominio es reconocida  por el Príncipe o cualquier otra autoridad de los Vástagos  en la ciudad donde se localice.  Los Vástagos que reclaman el dominio no pueden  evitar que los residentes vivos salgan a sus negocios, ni  ejercen ninguna influencia directa sobre ellos, pero pueden observar por sí mismos sus idas y venidas. Pueden  tener Aliados o Criados que vigilen específicamente si  hay vampiros desconocidos y alerten al personaje cuando encuentren a alguno.  Dominio se refiere específicamente a la geografía (en  muchos casos un vecindario o calle) y propiedades allí  presentes, en oposición a la gente que puede habitar allí  (que es en lo que hace hincapié Rebaño). Juega una parte importante en la sociedad de los Vástagos (los vampiros que carecen de un Dominio significativo rara vez  obtienen respeto) pero no da derecho automático a Posición entre los Condenados.  Podrías dedicar uno o más puntos en Dominio para  incrementar la seguridad del territorio de tu personaje  en vez de su tamaño. Cada punto dedicado a seguridad  otorga un penalización de +1 a la dificultad a los esfuerzos de cualquiera que se introduzca en el Dominio sin  permiso expreso, y una mejora de –1 a la dificultad a los  esfuerzos de tu personaje para identificar y rastrear a los  intrusos. Un Dominio de un punto de tamaño y dos de  seguridad, por ejemplo, es pequeño pero bastante resistente al allanamiento, al contrario de un Dominio  de puntuación de tres puntos de tamaño sin seguridad  extraordinaria.  Cada punto de Dominio reduce la dificultad para las  pruebas de Caza en él de tu personaje y de aquéllos a  quienes autorice. También se añade a tu reserva de Sangre inicial (no a la máxima). Si empleas la opción de  seguridad, cada punto empleado aumenta la dificultad  en +1 para vampiros no invitados. Ver pág. 259 para más  información sobre la Caza.  Para Dominio (tanto para tamaño como para seguridad) pueden emplearse puntos de Trasfondo Compartidos.  • Un simple y pequeño edificio, como  un hogar unifamiliar o un establecimiento social, suficiente para un  refugio básico.  •• Una iglesia, fábrica, almacén, bloque  de pisos u otra estructura grande, una  ubicación con un acceso directo pero  fácilmente controlable al mundo exterior.  ••• Torre, manzana de casas o una intersección importante, una ubicación o  área que ofrezca zonas para ocultarse  así como un acceso controlado.  •••• Una sección de alcantarillas, una red  de túneles de servicio, un enclave de  hogares en una colina sobre la ciudad,  un lugar con rasgos defensivos inherentes, como una aislada carretera de  montaña, acceso mediante un solo  puente o fuerza de seguridad privada.  ••••• Un barrio entero, una subdivisión étnica como “Chinatown” o “Little Italy”,  o todo un suburbio.  Como ya se ha explicado con anterioridad, los personajes de una coterie pueden compartir sus recursos de  Dominio para obtener mejores resultados. De seis a ocho  puntos aseguran toda una ciudad pequeña o una parte  específica de la ciudad como dominio. De 10 a 15 puntos aseguran un sector urbano importante pero no geográficamente extenso, como “los muelles” o “Highland  Park”. Una gran ciudad en sí misma podría costar más de  un centenar de puntos de Dominio, como Atlanta, Dallas, Ginebra o Bagdad. Una ciudad como Nueva York,  Londres, París, Roma, São Paulo o Shanghai requeriría  muchos cientos de puntos de Dominio"));
        Trasfondos.add(new Trasfondo(0, "Estatus", "Tienes algo de reputación y posición (merecida o no)  entre la comunidad local de Vástagos. El Estatus en la  sociedad de la Camarilla suele derivar tanto del de tu  Sire y del respeto que se debe a tu linaje particular como  de tu éxito personal. Entre el Sabbat, es más probable  que derive de la reputación de tu manada o del celo de  tu actitud. Los Antiguos son conocidos por tener poco  respeto por sus jóvenes; este Trasfondo lo puede mitigar  en parte.  Un elevado Estatus en la Camarilla no se aplica en la  sociedad Sabbat (y probablemente te convertirá en un  objetivo importante para los rivales de tu Secta), y viceversa. Igualmente, los Autarcas no suelen tener Estatus,  a menos que hayan acumulado de alguna manera tanto  poder y atención como para ser considerados fuerzas a  tener en cuenta. Puedes tener la posibilidad de hacer una  tirada de Estatus junto con un Rasgo Social para reflejar  los efectos positivos de tu prestigio.  Ten en cuenta que los personajes Caitiff no pueden  adquirir Estatus durante la creación de personaje. Son lo  más bajo de todo, y cualquier respeto que alcancen debe  adquirirse en el transcurso de la crónica.  • Conocido: Un Neonato/Sacerdote de  manada.  •• Respectado: Un Ancilla/Ductus respetado.  ••• Influyente: Un Antiguo/Templario.  •••• Poderoso: Un miembro de la Primogenitura/Obispo.  ••••• Luminaria: Un Príncipe/Arzobispo."));
        Trasfondos.add(new Trasfondo(0, "Fama", "Gozas de amplio reconocimiento en la sociedad mortal; quizás como artista, escritor o atleta. La gente puede  disfrutar sólo por ser vista contigo. Esto te da toda clase de privilegios al moverte en la sociedad mortal, pero  también atrae mucha atención no deseada ahora que ya  no estás vivo. La mayor arma que ofrece la fama es la capacidad de cambiar la opinión pública, como los medios  de comunicación modernos prueban constantemente.  La Fama no se vincula siempre al entretenimiento: un  perverso criminal inmerso en un gran proceso judicial  probablemente sea bastante famoso, igual que un legislador o un científico que haya hecho un descubrimiento  popular.  Este Trasfondo es obviamente un arma de doble filo.  Ciertamente puedes disfrutar de los privilegios de tu prestigio (conseguir los mejores asientos, ser invitado a  eventos que te perderías de otra manera, citarte con la  élite), pero a veces eres reconocido en momentos en los  que preferirías no serlo. Aún así, tus enemigos no pueden simplemente hacerte desaparecer sin provocar gran  conmoción, y encuentras más fácil Cazar en áreas pobladas ya que la gente acude a ti (reduces las dificultades de  tiradas de Caza en uno por punto en Fama). Además, tu  Narrador podría permitir reducir la dificultad de ciertas  tiradas sociales contra gente particularmente impresionable o fascinada con las celebridades.  • Eres conocido para una subcultura  selecta: fieles a los clubes locales, blogueros del entretenimiento o la gente  de Park Avenue, por ejemplo.  •• Gente al azar empieza a reconocer tu  cara; eres una celebridad menor, como  un criminal de poca monta o un presentador de noticias locales.  ••• Tienes mucho renombre; quizás eres  un senador o una artista que regularmente consigue cientos de miles de  clicks en YouTube.  •••• Una celebridad en toda regla; tu nombre es reconocido casi siempre por la  gente común en la calle.  ••••• Eres alguien bien conocido por todos.  La gente le pone tu nombre a sus hijos"));
        Trasfondos.add(new Trasfondo(0, "Generación", "Este Trasfondo representa tu Generación: la pureza de  tu Sangre y tu proximidad al Primer Vampiro. Una puntuación alta en Generación puede representar un Sire  poderoso o un gusto decididamente peligroso por la Diablerie. Si no adquieres ningún punto en este Rasgo, comienzas jugando como un vampiro de la Decimotercera  Generación. Ver pág. 270 para más información.  • Duodécima Generación: reserva de  Sangre 11, puedes gastar 1 punto de  Sangre por turno.  •• Undécima Generación: reserva de  Sangre 12, puedes gastar 1 punto de  Sangre por turno.  ••• Décima Generación: reserva de Sangre  13, puedes gastar 1 punto de Sangre  por turno.  •••• Novena Generación: reserva de Sangre  14, puedes gastar 2 puntos de Sangre  por turno.  ••••• Octava Generación: reserva de Sangre  15, puedes gastar 3 puntos de Sangre  por turno"));
        Trasfondos.add(new Trasfondo(0, "Identidad Alternativa", "Mantienes una identidad alternativa completa, con  papeles, partidas de nacimiento o cualquier otra documentación que desees. Sólo unos pocos pueden saber tu  nombre o identidad real. Tu personalidad alternativa  podría estar muy implicada en el crimen organizado, ser  un miembro de la Secta opuesta, un estafador que usa  identidades alternativas para sus líos o podrías dedicarte  simplemente a reunir información sobre el enemigo. De  hecho, algunos vampiros pueden conocerte como un individuo mientras otros creen que eres alguien totalmente  diferente.  • Eres nuevo en este juego de identidades. A veces te despistas y olvidas tu  otra personalidad.  •• Bien asentado en tu identidad alternativa. Eres tan convincente como para  simular el papel de un doctor, abogado,  agente de pompas fúnebres, traficante  de drogas o un espía capaz.  ••• Tienes buena reputación como tu personalidad alternativa y se te reconoce  por ese nombre en el área donde te has  infiltrado.  •••• Tu identidad alternativa se ha ganado  respeto y confianza dentro del área de  infiltración.  ••••• Inspiras respeto en tu área de infiltración, y puedes incluso haber acumulado algo de influencia. Tienes la  confianza (o al menos el reconocimiento) de muchos individuos poderosos dentro de tu área."));
        Trasfondos.add(new Trasfondo(0, "Influencia", "Tienes tirón en la comunidad mortal, sea a través de  riqueza, prestigio, cargos políticos, chantaje o manipulación sobrenatural. Los Vástagos con gran Influencia  pueden condicionar, y en raros casos incluso controlar,  los procesos políticos y sociales de la sociedad humana.  Influencia representa la suma de tu poder para manipular  a la opinión pública y la política en tu comunidad, especialmente la policía y la burocracia. En algunos casos,  cultivarla es una vía para generar Recursos (consulta a  continuación). Algunas tiradas pueden requerir que uses Influencia en  vez de una Habilidad, especialmente cuando tratas de  influir en burócratas menores. Es más fácil iniciar cambios radicales a un nivel local que a escala global (por  ejemplo, provocar que un edificio “abandonado” sea demolido es relativamente fácil, mientras que empezar una  guerra es un poco más difícil).  En Influencia pueden emplearse puntos de Trasfondo  Compartido.  • Moderadamente influyente; un factor  en la política local.  •• Bien conectado; una fuerza en políticas  provinciales o estatales.  ••• Posición de influencia; un factor en  políticas regionales.  •••• Extenso poder personal; una fuerza en  políticas nacionales.  ••••• Enormemente influyente; un factor en  política mundial."));
        Trasfondos.add(new Trasfondo(0, "Mentor", "Este Rasgo representa a un Vástago o grupo de éstos  que cuida de ti, ofreciendo guía o ayuda de vez en cuando. Un Mentor puede ser poderoso, pero su poder no necesita ser directo. Dependiendo del número de puntos  en este Trasfondo, tu mentor podría no ser más que un  vampiro con una notable red de información, o podría  ser una criatura centenaria con tremenda influencia y  poder sobrenatural. Podría ofrecer consejo, hablar al  Príncipe o Arzobispo en tu favor, alejar de ti a otros Antiguos o aconsejarte cuando des con situaciones que no  comprendes.  Casi siempre tu mentor es tu Sire, pero bien podría ser cualquier Cainita con interés en tu bienestar. Una puntuación alta de Mentor podría incluso  representar un grupo de vampiros afines, como los  Antiguos de la Capilla local Tremere o una célula de  la Mano Negra.  Ten en cuenta que este Rasgo no es una tarjeta de  “Sal libre de la Cárcel”. Tu Mentor no llegará necesariamente como la caballería cuando estés en peligro (y  si lo hace, es posible que pierdas un punto o más en este  Trasfondo al incurrir en su ira). Además, ocasionalmente podría esperar algo a cambio de su patrocinio, lo que  puede llevar a numerosas e interesantes historias. Por  lo general, un mentor permanece a distancia, dándote  información o consejos útiles por camaradería, pero te  abandonará sin dudarlo si demuestras ser un protegido  indigno o problemático.  • El Mentor es un Ancilla de poca  influencia o un Ductus o Sacerdote de  manada.  •• El Mentor es respetado: un Antiguo  o un veterano muy condecorado, por  ejemplo.  ••• El Mentor es enormemente influyente,  como un miembro de la Primogenitura  o un Obispo.  •••• El Mentor tiene gran cantidad de  poder sobre la ciudad: un Príncipe o  Arzobispo, por ejemplo.  ••••• El Mentor es extraordinariamente  poderoso, quizás incluso un Justicar o  Cardenal."));
        Trasfondos.add(new Trasfondo(0, "Mienbro de la mano Negra", "Este Trasfondo sólo está disponible para personajes del Sabbat.  Eres miembro de la temida Mano Negra, la masa de  soldados y asesinos que sirve al Sabbat con fervor. Tener  este Trasfondo indica que eres miembro de pleno derecho de la organización, y tienes todas las responsabilidades y beneficios que acompañan a la membresía.  Puedes pedir ayuda a miembros de la Mano Negra para  que te auxilien si alguna vez lo necesitas. Por supuesto,  esta capacidad se da en ambos sentidos, y otros miembros de la Mano pueden requerir que los ayudes. Por ello,  puedes encontrar que se te asignan asesinatos, que has de  prestar ayuda marcial o incluso promover los objetivos  políticos de la Mano como diplomático o espía. También se te puede requerir que atiendas a cruzadas que te  alejen de tu manada. Todo miembro de la Mano Negra  debe atender la llamada de otro miembro, especialmente  de los superiores de la facción.  Ser un miembro de la Mano Negra es algo prestigioso, y otros miembros del Sabbat respetan la organización. Cuando trates con otros Sabbat, si decidieras  revelar tu afiliación con la Mano, puedes añadir tu  puntuación en este Trasfondo a cualquier reserva Social, incluso junto con tu Estatus u otras Habilidades.  Muchos miembros de la Mano, sin embargo, eligen no  revelar sus lealtades. La Mano Negra es muy competente al cazar Sabbat que presumen de membresía en  la Secta pero no pertenecen a ella de verdad (mentirosos, tened cuidado).  • Eres soldado raso; puedes pedir ayuda a  un miembro de la Mano Negra una vez  por historia.•• Eres conocido y respetado en la Mano  Negra; puedes pedir ayuda a dos miembros de la Mano Negra una vez por  historia.  ••• Se te tiene en alta estima en la Mano  Negra; puedes pedir ayuda a cinco  miembros de la Mano Negra una vez  por historia.  •••• Eres un héroe entre los miembros de  la Mano Negra; puedes pedir ayuda  a siete miembros de la Mano Negra  dos veces por historia (pero es mejor  que tengas una buena razón; si parece  que te ablandas, puedes perder puntos  en este Trasfondo). Puedes también  liderar en batalla a un gran número de  miembros de la Mano si alguna vez es  necesario.  ••••• Eres parte de las leyendas de la Mano  Negra; puedes llamar a 12 miembros de  la Mano Negra dos veces por historia  (pero ten en cuenta el aviso previo).  También puedes liderar en batalla a un  gran número de miembros de la Mano  en acción si hace falta. Puede incluso  que los Serafines busquen tu consejo  en asuntos de importancia"));
        Trasfondos.add(new Trasfondo(0, "Rebaño", "Has formado un grupo de mortales de quienes puedes alimentarte sin miedo. Un Rebaño puede tomar  muchas formas, desde círculos de fiesteros fetichistas  a cultos reales formados a tu alrededor como si fueras  una figura divina. Además de proveer alimento, tu  Rebaño podría ser útil para tareas menores, aunque  normalmente no son demasiado controlables, ni están conectados estrechamente a ti, ni son particularmente capaces (para peones más eficaces, adquiere  Aliados o Criados). Tu puntuación de Rebaño añade  dados a tus tiradas para Cazar; ver pág. 259 para más  detalles.  Los jugadores pueden adquirir Rebaño con puntos de  Trasfondo Compartido.  • Tres recipientes.  •• Siete recipientes.  ••• 15 recipientes.  •••• 30 recipientes.  ••••• 60 recipientes"));
        Trasfondos.add(new Trasfondo(0, "Recursos", " Recursos son los bienes valiosos que están a disposición  de tu personaje. Estas posesiones pueden ser dinero en  efectivo, pero cuando este Trasfondo se incrementa, es  más probable que sean inversiones, propiedades o réditos  de capitales de alguna clase: tierras, inversiones industriales, acciones y bonos, mercancías, infraestructuras criminales, contrabando o incluso impuestos o diezmos. Recuerda que los vampiros no necesitan disponer de comida  excepto Sangre y que sus necesidades reales (opuestas a  sus preferencias) de cobijo son muy asequibles. Los Recursos para los vampiros consisten principalmente en pagar  los lujos y gastos asociados al desarrollo y mantenimiento  de Estatus, Influencia y otros Trasfondos. Un personaje  sin puntos en Recursos puede tener suficiente ropa y suministros para salir adelante o podría ser un indigente que  ocupa el embalaje de un frigorífico debajo de un puente.  Recibes una renta básica cada mes basada en tu puntuación, así que asegúrate de detallar exactamente de  dónde viene este dinero, sea un trabajo, un fideicomiso  o dividendos. (Los Narradores deciden según tu localización y un período de tiempo relevante una cantidad de  dinero en efectivo adecuada para tu renta mensual). Después de todo, la fortuna de un Vástago podría muy bien  agotarse en el transcurso de una crónica, dependiendo de  cómo de bien la mantenga. También puedes vender tus  recursos menos líquidos si necesitas efectivo, pero esto  puede requerir semanas o incluso meses, dependiendo de  lo que trates de vender en concreto. Los compradores de  arte no caen de los árboles después de todo.  Los jugadores pueden adquirir Recursos para sus personajes con puntos de Trasfondo Compartido.  • Suficiente. Puedes mantener una  residencia típica de la clase trabajadora  con estabilidad, incluso con infrecuentes derroches.  •• Moderado. Puedes mostrarte como un  miembro próspero de la clase media, con  el regalo o capricho ocasionales propios de alguien de una posición incluso  superior. Puedes costearte un sirviente  o contratar ayuda especializada en caso  necesario. Una fracción de tus recursos  está disponible en dinero, propiedades  fácilmente transportables (como joyería  o mobiliario) y otros enseres de valor  (como un coche o un hogar modesto)  que te permiten mantener un nivel de  vida como en el primer punto allá donde  te encuentres, hasta seis meses. ••• Confortable. Eres un destacado y bien  establecido miembro de tu comunidad,  con tierras y una vivienda en propiedad, y tienes una reputación que te  permite tirar de crédito de forma muy  generosa. Probablemente, también  tienes más activos y bienes que dinero  en efectivo. Puedes mantener una calidad de vida de un punto donde quiera  que estés sin dificultad cuanto tiempo  quieras.  •••• Rico. Rara vez tocas dinero en efectivo,  ya que la mayoría de tus activos existen  en formas intangibles que son más  valiosas y estables que el papel moneda.  Acumulas más riqueza que la mayor  parte de tus semejantes (si se les puede  llamar así). Cuando la adquisición de  tus Recursos no disfrute de tu habitual  grado de atención, puedes mantener  una existencia de tres puntos hasta un  año, y de dos indefinidamente.  ••••• Extremadamente Rico. Eres el modelo  de lo que otros luchan por alcanzar,  al menos en la mente popular. Los  programas de televisión, las portadas  de las revistas y las webs de cotilleos  hablan sobre tu ropa, el mobiliario de  tus numerosas casas y el lujo de tus  vehículos. Tienes amplias y muy repartidas inversiones, quizás vinculadas  a los destinos de naciones, cada una  con mucho personal y conexiones con  todos los niveles de la sociedad de una  región. Viajas siempre con un mínimo de comodidades de 3 puntos, más  con algo de esfuerzo. Corporaciones  y gobiernos a veces acuden a ti para  comprar valores o emisiones de bonos"));
        Trasfondos.add(new Trasfondo(0, "Rituales", "Este Trasfondo sólo está disponible para personajes del Sabbat.  Conoces los Ritae y rituales del Sabbat y puedes realizar muchos de ellos. Este Trasfondo es vital para ser un  Sacerdote de manada, pues sin él, los Ritae no funcionarán. Esto es en realidad una investidura sobrenatural,  que emana de la magia de los más antiguos hechiceros  Tzimisce. Los Vampiros del Sabbat que no sean Sacerdotes de sus manadas deberían tener una razón excepcional para adquirirlo, ya que los Sacerdotes son reacios a  compartir sus secretos con los miembros más seculares de  la Secta. Algunos ejemplos de rituales incluyen la Vaulderie (ver pág. 301), así como aquéllos presentes en el  Apéndice (ver pág. 507).  • Conoces unos pocos Auctoritas Ritae  (a tu elección).  •• Conoces algunos Auctoritas Ritae  (a tu elección) y unos pocos Ignoblis  Ritae (a tu elección).  ••• Conoces todos los Auctoritas Ritae y  algunos Ignoblis Ritae (a tu elección).  Además, puedes crear Ignoblis Ritae  propios con suficiente tiempo (consulta a tu Narrador para tiempo de  desarrollo y efectos en el juego).  •••• Conoces todos los Auctoritas Ritae y  muchos Ignoblis Ritae (a tu elección).  Puedes crear Ignoblis Ritae propios con  suficiente tiempo (consulta a tu Narrador para tiempo de desarrollo y efectos  en el juego). Estás además familiarizado  con las funciones de numerosos Ignoblis  Ritae regionales y específicos de manadas, incluso si no puedes realizarlos.  ••••• Conoces todos los Auctoritas Ritae y docenas de Ignoblis Ritae (a tu elección).  Puedes crear Ignoblis Ritae propios con  suficiente tiempo (consulta a tu Narrador para tiempo de desarrollo y efectos  en el juego). Estás además familiarizado con las funciones de casi todos los  Ignoblis Ritae regionales y específicos de  manadas, incluso si no puedes realizarlos;  si ha sido transcrito o transmitido a la  tradición, has oído hablar de él"));

        return Trasfondos;

    }

    public static ArrayList<atributo> Atributos_F_V20() {
        ArrayList<atributo> atributos = new ArrayList<>();
        atributos.add(new atributo("Fuerza", "Fuerza es la potencia física bruta del personaje. Determina el peso que éste puede levantar o empujar y  cómo de fuerte puede golpear a otro personaje u objeto.  El Rasgo Fuerza se suma a la reserva de dados de daño  del personaje cuando consigue alcanzar a su oponente en  combate cuerpo a cuerpo. También se emplea si se quiere romper, levantar o transportar algo, así como cuando  un personaje desea realizar un salto. "
                + "\n• Malo: Puedes levantar algo menos de  20 kg (40 lb).  \n•• Normal: Puedes levantar cerca de 50  kg (100 lb).  \n••• Bueno: Puedes levantar poco más de  100 kg (250 lb).  \n•••• Excepcional: Puedes levantar casi 200  kg (400 lb).  \n••••• Sobresaliente: Puedes levantar unos  300 kg (650 lb.) y aplastar cráneos  como si fueran uvas.  "
                + "\nEspecialidades: Agarre Fuerte, Brazos Potentes, Reservas de Fuerza, Violento"));
        atributos.add(new atributo("Destreza", "El Atributo Destreza determina la pericia general del  personaje. Incluye su rapidez, su agilidad y su velocidad  general, además de indicar su capacidad para manipular  objetos con control y precisión. En este Atributo se incluyen también la coordinación ojo-mano, los reflejos y  la gracia de movimientos. "
                + "\n • Malo: Eres bastante torpe. Baja esa  pistola antes de que te hagas daño.  \n•• Normal: No eres patoso, pero tampoco  una bailarina.  \n••• Bueno: Tienes un cierto potencial  atlético.  \n•••• Excepcional: Si quisieras podrías ser  acróbata.  \n••••• Sobresaliente: Tus movimientos son lí-  quidos e hipnóticos, casi sobrehumanos.  "
                + "\nEspecialidades: Preciso, Veloz, Gracia Felina, Reflejos  Rápidos."));
        atributos.add(new atributo("Resistencia", "El Rasgo Resistencia refleja la salud, aguante y vigor  de un personaje. Indica hasta qué punto puede forzarse y cuánto castigo es capaz de soportar antes de sufrir  un trauma físico. Resistencia también incluye una cierta  fortaleza mental que representa el aguante y la tenacidad  del personaje.  "
                + "\n• Malo: No soportas un viento fuerte.  \n•• Normal: Estás en buena forma y puedes  aguantar un par de puñetazos.  \n••• Bueno: Tu condición física es muy  buena y apenas padeces enfermedades.  \n•••• Excepcional: Podrías correr (y quizá  ganar) cualquier maratón que quisieras.  \n••••• Sobresaliente: Tu constitución es realmente hercúlea.  "
                + "\nEspecialidades: Infatigable, Decidido, Duro Como el  Acero, Vigoroso."));
        return atributos;
    }

    public static ArrayList<atributo> Atributos_S_V20() {
        ArrayList<atributo> atributos = new ArrayList<>();
        atributos.add(new atributo("Carisma", " Carisma es la capacidad de un personaje de agradar  a los demás mediante su personalidad. Este Atributo se  emplea cuando un personaje trata de ganarse la simpatía de otro o cuando intenta que los demás confíen en  él; refleja su poder para encantar e influenciar. Carisma  determina la capacidad del personaje para convencer a  los demás de sus puntos de vista. Este Atributo no indica  necesariamente de qué manera el personaje es carismático, puede tratarse de un embaucador de pico de oro o de  un matón sarcástico (esto debe manifestarse a través de  la interpretación y las Especialidades). \n• Malo: No tienes mucha personalidad.  \n•• Normal: Sueles caer bien y tienes algunos amigos.  \n••• Bueno: La gente siempre confía en ti.  \n•••• Excepcional: Posees un gran magnetismo personal.  \n••••• Sobresaliente: Culturas enteras podrían seguir tu liderazgo.  "
                + "\nEspecialidades: Elegante, Labia, Convincente, Sofisticado, Agudo, Elocuente, Embaucador."));
        atributos.add(new atributo("Manipulación", "Manipulación determina la capacidad de un personaje  para conseguir de un modo u otro que los demás compartan sus puntos de vista o sigan sus dictados. En resumen,  sirve para que los demás hagan lo que uno quiera. Entra  en escena cuando un personaje intenta influir o guiar  sutilmente el comportamiento de otro, y se utiliza para  engañar, embaucar, confundir o coaccionar a otros personajes. No importa que les guste o no el manipulador  (en esto se diferencia de Carisma). Después de todo un  motivador habilidoso puede incluso emplear los talentos  de aquéllos que lo odian. La Manipulación es un juego peligroso, aunque sea  la forma principal en la que muchos Vástagos afectan  al mundo que los rodea. Los fallos pueden provocar la  ira de la supuesta víctima, y un fracaso puede añadir un  nombre más a la lista de enemigos del personaje.  La gente es manipulada todos los días y normalmente lo ignora («¿Por qué no vas a la tienda por mí?»).  Sin embargo, si a la gente se le señala el hecho, suele  adoptar una postura bastante defensiva. La Manipulación puede ser el arma más poderosa en el repertorio de un Vástago, pero los fallos son potencialmente  desastrosos. Los personajes con puntuaciones altas en  Manipulación suelen recibir la desconfianza de los  demás.  \n• Malo: Una persona de pocas (y a menudo ineficaces) palabras.  \n•• Normal: A veces puedes engañar a  otros, como casi todo el mundo.  \n••• Bueno: Siempre consigues descuentos.  \n•••• Excepcional: Podrías ser político o  líder de una secta.  \n••••• Sobresaliente: «¡Por supuesto! ¡Le diré  al Príncipe que fui yo el que intentó  estacarlo!»  "
                + "\nEspecialidades: Persuasivo, Seductor, Razonable,  Liante, Invocador de “Hechos”."));
        atributos.add(new atributo("Apariencia", "El Atributo Apariencia es una medida de cómo de  buena es la primera impresión que da un personaje.  Puede tratarse de un “atractivo” convencional, pero  también puede ser el efecto de rasgos distintivos: un  aspecto exótico, un aire de confianza, una postura imponente, estilo para vestir bien o cualquier cosa que sea  notable al ver por primera vez al personaje. Ciertamente, Apariencia es un amalgama de muchas características descriptivas personales. Es inconsciente e instintiva: apela a los niveles inferiores de la psique, de modo  que afecta a las primeras impresiones y a la naturaleza  de los recuerdos posteriores.  Este Rasgo sirve para algo más que conseguir que recipientes potenciales te sigan por la pista de baile. En situaciones en las que la primera impresión es importante,  o que estén relacionadas con gente que valora el aspecto  físico, un personaje podría ver sus reservas de dados Sociales limitada a su puntuación en Apariencia. Por tanto, es importante tener el mejor aspecto posible o que se  te conozca antes de empezar a pedir ayuda para incendiar  el refugio del Justicar. \n• Malo: Tus ropas apestan, la gente te  evita, o simplemente eres condenadamente feo.  \n•• Normal: No destacas en una multitud,  para bien o para mal.  \n••• Bueno: «Déjame invitarte a un trago».  \n•••• Excepcional: La gente se desvía de su  camino para conocerte.  \n••••• Sobresaliente: La gente nunca se olvida de ti.  "
                + "\nEspecialidades: Estilo Poco Convencional, Fotogénico, Sentido de la Moda, Rostro Inolvidable, Pose Memorable"));
        return atributos;
    }

    public static ArrayList<atributo> Atributos_M_V20() {
        ArrayList<atributo> atributos = new ArrayList<>();
        atributos.add(new atributo("Perfeción", "Percepción mide la capacidad del personaje de observar su entorno. Puede tratarse de un esfuerzo consciente  (como registrar una zona), pero normalmente es un acto  intuitivo en el que los sentidos del personaje detectan algo  fuera de lo común. Percepción es la sensibilidad del personaje hacia lo que lo rodea, y no suele estar presente en los  cínicos y los hastiados (que ya lo han visto todo).  Se emplea para determinar si un personaje comprende una determinada situación y si detecta un estímulo  ambiental. Puede advertir al personaje de emboscadas,  distinguir una pista en un montón de basura o desvelar  cualquier detalle oculto o bien camuflado, ya sea físico o  de otra naturaleza.  "
                + "\n• Malo: Quizás estés totalmente absorto  en ti mismo o seas sencillamente un  cabeza hueca; en cualquier caso, ¡cuidado con ese coche!  \n•• Normal: Las sutilezas se te escapan,  pero eres capaz de percibir la imagen  general.  \n••• Bueno: Percibes ambientes, texturas y  cambios minúsculos en tu entorno.  \n•••• Excepcional: Prácticamente nada se te  escapa.  \n••••• Sobresaliente: Observas inmediatamente cosas casi imperceptibles para  los sentidos humanos. "
                + "\nEspecialidades: Atento, Perspicaz, Cuidadoso, Sagaz,  Táctico."));
        atributos.add(new atributo("Inteligencia", "Inteligencia  El Atributo Inteligencia se refiere a la capacidad del  personaje de aprehender hechos y conocimientos. Además controla la capacidad del personaje de razonar, resolver problemas y evaluar situaciones. Inteligencia también incluye el pensamiento crítico y flexible.  Inteligencia no incluye la experiencia, la sabiduría,  ni el sentido común, ya que éstas son propiedades de la  personalidad del personaje, no Rasgos. Hasta el personaje más inteligente puede ser demasiado insensato como  para darse cuenta de que los matones que le piden las  llaves del coche no pueden querer nada bueno.  Los personajes con una Inteligencia baja no son necesariamente estúpidos (aunque puede ser el caso), sino  que podrían carecer de educación o tener un razonamiento muy simple. Del mismo modo, no todos los que  tienen Inteligencia alta son Einsteins; pueden ser buenos  memorizando o tener un juicio especialmente agudo.  "
                + "\n• Malo: No eres el más listo de la clase.  \n•• Normal: Lo suficientemente listo como  para saberte normal.  \n••• Bueno: Más despierto que las masas.  \n•••• Excepcional: No sólo eres listo, sino  realmente brillante.  \n••••• Sobresaliente: Auténtico genio.  "
                + "\nEspecialidades: Conocimiento Teórico, Creativo,  Analítico, Resolución de Problemas, Autoridad en una  Materia."));
        atributos.add(new atributo("Astucia", "El Rasgo Astucia mide la habilidad del personaje para  pensar sobre la marcha y reaccionar rápidamente en una  situación dada, y también refleja el ingenio general. Los  personajes con una Astucia baja serán algo torpes y de  mente aletargada, o quizá crédulos y poco sofisticados.  En cambio, los personajes con una puntuación elevada  en este Atributo casi siempre dan con un plan de forma  inmediata y se adaptan a su entorno de forma apropiada.  Dichos personajes también logran mantener la calma en  situaciones tensas.  "
                + "\n• Malo: Tírame del dedo.  \n•• Normal: Sabes cuándo apostar y cuándo plantarte en el póquer.  \n••• Bueno: No suelen sorprenderte ni  dejarte sin palabras  \n•••• Excepcional: Eres de esos tipos que hacen que al día siguiente todos piensen:  «Oh, debería haber dicho...»  \n••••• Sobresaliente: Piensas y respondes más  rápido de lo que actúas.  "
                + "\nEspecialidades: Llevar la Iniciativa, Ocurrente, Cambios de Estrategia, Emboscadas"));
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

    public static ArrayList<Sendas> Sendas_V20() {
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
        return sendas;
    }

    public static ArrayList<Disciplina> Disciplinas_v20() {
        ArrayList<Disciplina> disciplina = new ArrayList<>();
        disciplina.add(new Disciplina("Animalismo"));
        disciplina.add(new Disciplina("Auspex"));
        disciplina.add(new Disciplina("Celeridad"));
        disciplina.add(new Disciplina("Dementación"));
        disciplina.add(new Disciplina("Dominación"));
        disciplina.add(new Disciplina("Extinción"));
        disciplina.add(new Disciplina("Fortaleza"));
        disciplina.add(new Disciplina("Necromancia", true));
        disciplina.add(new Disciplina("Obtenebración"));
        disciplina.add(new Disciplina("Ofuscación"));
        disciplina.add(new Disciplina("Potencia"));
        disciplina.add(new Disciplina("Presencia"));
        disciplina.add(new Disciplina("Protean"));
        disciplina.add(new Disciplina("Quimerismo"));
        disciplina.add(new Disciplina("Serpentis"));
        disciplina.add(new Disciplina("Taumaturgia", true));
        disciplina.add(new Disciplina("Vicisitud"));
        return disciplina;
    }

    public static ArrayList<N_Disciplina> n_disciplinas_V20() {
        ArrayList<N_Disciplina> Nivel_Disciplina = new ArrayList<>();
        String d;

        // Nivel_Disciplina.add(new N_Disciplina(Disciplina, Nombre, Descripcion, 0));
        d = "Animalismo";

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

        d = "Auspex";

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

        d = "Celeridad";

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

        d = "Dementación";

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

        d = "Dominación";

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

        d = "Extinción";

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

        d = "Fortaleza";

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

        d = "Necromancia";

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

        d = "Obtenebración";

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

        d = "Ofuscación";

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

        d = "Potencia";

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

        d = "Presencia";

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

        d = "Protean";

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

        d = "Quimerismo";

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

        d = "Serpentis";

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

        d = "Taumaturgia";

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

        d = "Vicisitud";

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

    public static void D_Sendas_V20() {
        ArrayList<DSendas> sendas = new ArrayList<>();

        sendas.add(new DSendas("Contramagia"));
        sendas.add(new DSendas("Conjuración"));
        sendas.add(new DSendas("Control del Clima"));
        sendas.add(new DSendas("Corrupción"));
        sendas.add(new DSendas("Dominio Elemental"));
        sendas.add(new DSendas("Encanto de las Llamas"));
        sendas.add(new DSendas("Manos de Destrucción"));
        sendas.add(new DSendas("Marte"));
        sendas.add(new DSendas("Movimiento Menta"));
        sendas.add(new DSendas("Poder de Neptuno"));
        sendas.add(new DSendas("Sangre"));
        sendas.add(new DSendas("Tecnomancia"));
        sendas.add(new DSendas("Venganza del Padre"));
        sendas.add(new DSendas("Verde"));

        sendas.add(new DSendas("Cadáver dentro del Monstruo"));
        sendas.add(new DSendas("Cenizas"));
        sendas.add(new DSendas("Cenotafio"));
        sendas.add(new DSendas("Cuatro Humores"));
        sendas.add(new DSendas("Osario"));
        sendas.add(new DSendas("Podredumbre de la Tumba"));
        sendas.add(new DSendas("Sepulcro"));
        sendas.add(new DSendas("Vítrea"));

    }

    public static void N_D_Sendas_V20() {
        ArrayList<N_Disciplina> Sendas = new ArrayList<>();
        String s, d;
        d = "Taumaturgia";

        s = "Contramagia";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Conjuración";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Control del Clima";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Corrupción";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Dominio Elemental";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Encanto de las Llamas";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Manos de Destrucción";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Marte";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Movimiento Menta";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Poder de Neptuno";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Sangre";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Tecnomancia";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Venganza del Padre";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Verde";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        d = "Necromancia";

        s = "Cadáver dentro del Monstruo";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Cenizas";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Cenotafio";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Cuatro Humores";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Osario";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Podredumbre de la Tumba";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Sepulcro";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));

        s = "Vítrea";
        Sendas.add(new N_Disciplina(d, s, "", "", 1));
        Sendas.add(new N_Disciplina(d, s, "", "", 2));
        Sendas.add(new N_Disciplina(d, s, "", "", 3));
        Sendas.add(new N_Disciplina(d, s, "", "", 4));
        Sendas.add(new N_Disciplina(d, s, "", "", 5));
    }

}
