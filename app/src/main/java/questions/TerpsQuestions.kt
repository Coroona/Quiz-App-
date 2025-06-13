package com.example.cannaquiz.questions

import com.example.cannaquiz.model.Question
object TerpsQuestions {
//Fragen nach Abruffolge geordnet
    val questions = listOf(
        Question(
            question = "Was sind Terpene hauptsächlich?",
            options = listOf("Zuckerarten", "Aromatische Verbindungen", "Proteine"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Was sind Trichome?",
            options = listOf("Wurzelhaare", "Kleine Harzdrüsen auf Blättern und Blüten", "Blütenstempel"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welche Farbe haben die meisten Trichome, wenn sie reif sind?",
            options = listOf("gelb- orange", "Grün", "Milchig-weiß bis bernsteinfarben"),
            correctAnswerIndex = 2
        ),
        Question(
            question = "Wie kann man die Produktion von Trichomen während des Anbaus steigern?",
            options = listOf(
                "Durch Verlängerung der Dunkelphase auf 18 Stunden",
                "Durch gezielten Stress wie leichtes Beschneiden oder Temperaturänderungen",
                "Durch erhöhte Stickstoffdüngung in der Blütephase"
            ),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welchen Zweck erfüllen Terpene für die Pflanze?",
            options = listOf(
                "Fotosynthese fördern",
                "Schutz vor Fressfeinden und UV-Strahlung",
                "Wasser speichern"
            ),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wo befinden sich die meisten Trichome an der Cannabispflanze?",
            options = listOf("Wurzeln", "Auf den Blüten und Blättern", "Stamm"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welches Terpen ist bekannt für seinen zitronigen Geruch?",
            options = listOf("Limonen", "Myrcen", "Pinene"),
            correctAnswerIndex = 0
        ),
        Question(
            question = "Welches Terpen hat typischerweise einen erdigen, moschusartigen Geruch?",
            options = listOf("Limonen", "Myrcen", "Linalool"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wie beeinflussen Terpene das Raucherlebnis?",
            options = listOf("Sie färben den Rauch", "Sie beeinflussen Geschmack und Wirkung", "Sie machen den Rauch klarer"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Was schützt Trichome vor UV-Strahlen?",
            options = listOf("Chlorophyll", "Das Harz und die darin enthaltenen Verbindungen", "Wasserfilm auf den Blättern"),
            correctAnswerIndex = 1
        ),
        // Level 2 – Fortgeschritten
        Question(
            question = "Wann bildet die Cannabispflanze die meisten Trichome?",
            options = listOf("Während der frühen Blütephase", "Während der späten Vegetationsphase", "Während der späten Blütephase"),
            correctAnswerIndex = 2
        ),
        Question(
            question = "Welche Trichomart ist hauptsächlich für das Harz verantwortlich?",
            options = listOf("Kapselförmige Trichome", "Sitzende (glanduläre) Trichome", "Borstenhaare"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Was ist das Hauptziel der Produktion von Terpenen bei Cannabis?",
            options = listOf("Produktion von Zucker", "Abwehr von Schädlingen und Anlocken von Bestäubern", "Wasseraufnahme verbessern"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welches Terpen ist für seinen entspannenden Lavendel-Duft bekannt?",
            options = listOf("Limonen", "Linalool", "Pinene"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welche Trichome produzieren hauptsächlich Cannabinoide?",
            options = listOf("Nicht-glanduläre Trichome", "Glanduläre Trichome (Kopftrichome)", "Haare auf dem Stamm"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wie verändert sich das Terpenprofil während der Blüte?",
            options = listOf("Es bleibt konstant", "Es entwickelt sich und ändert sich je nach Blütephase", "Es verschwindet komplett"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Was kann eine frühere Ernte der Trichome bewirken?",
            options = listOf("Mehr Aroma", "Weniger Potenz und flachere Wirkung", "Höheren THC-Gehalt"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wie wirkt das Terpen Pinene auf den menschlichen Körper?",
            options = listOf("Beruhigend", "Erfrischend und konzentrationsfördernd", "Schlaffördernd"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wie viele Arten von Trichomen gibt es bei Cannabis hauptsächlich?",
            options = listOf("1", "2", "3"),
            correctAnswerIndex = 2
        ),
        Question(
            question = "Welche Rolle spielt das Terpen Myrcen in Kombination mit THC?",
            options = listOf("Es neutralisiert THC", "Es verstärkt die beruhigende Wirkung", "Es macht THC unwirksam"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wie beeinflusst die Temperatur die Trichomentwicklung?",
            options = listOf(
                "Temperaturen über 30 °C können Trichomproduktion fördern, führen aber oft zu Stress",
                "Kältere Temperaturen können Terpenprofile verändern, ohne Trichomzahl stark zu beeinflussen",
                "Optimale Temperaturen (zwischen 20–28 °C) fördern gesunde Trichome und Harzbildung"
            ),
            correctAnswerIndex = 2
        ),
        Question(
            question = "Welche Anbaumethode kann die Trichomendichte erhöhen?",
            options = listOf(
                "Einsatz von Leuchtstoffröhren mit hohem Blauanteil zur vegetativen Förderung",
                "Verwendung von LED-Licht mit speziellem Spektrum, um Harzbildung zu stimulieren",
                "Erhöhung der Luftfeuchtigkeit über 70 % während der Blütephase"
            ),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welches Trichom produziert keine Cannabinoide, sondern dient nur als Schutz?",
            options = listOf("Kapselförmiges Trichom", "Kopftrichom", "Borstenhaare"),
            correctAnswerIndex = 2
        ),
        Question(
            question = "Was ist ein Haupteffekt von Terpenen auf die Blut-Hirn-Schranke?",
            options = listOf("Sie blockieren sie komplett", "Sie können die Aufnahme von Cannabinoiden beeinflussen", "Sie haben keinen Effekt"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welche Trichomart ist besonders empfindlich gegenüber Temperaturschwankungen?",
            options = listOf("Borstenhaare", "Kapselförmige Trichome", "Sitzende glanduläre Trichome"),
            correctAnswerIndex = 2
        ),
        Question(
            question = "Was ist „Entourage Effect“?",
            options = listOf("Der Effekt von Licht auf Pflanzen", "Die synergistische Wirkung von Terpenen und Cannabinoiden zusammen", "Ein Pilz, der Trichome angreift"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wie beeinflusst die Trocknung die Terpenkonzentration?",
            options = listOf("Sie erhöht sie dauerhaft", "Falsche Trocknung kann Terpene abbauen und Verlust verursachen", "Sie hat keinen Einfluss"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Welches Terpen ist bekannt für seine entzündungshemmende Wirkung?",
            options = listOf("Pinene", "Limonen", "Beta-Caryophyllen"),
            correctAnswerIndex = 2
        ),
        Question(
            question = "Wie werden Trichome bei der Extraktion von Cannabisprodukten genutzt?",
            options = listOf("Sie werden entfernt, da sie nutzlos sind", "Sie sind Hauptquelle für Cannabinoide und Terpene", "Sie färben das Extrakt grün"),
            correctAnswerIndex = 1
        ),
        Question(
            question = "Wie beeinflusst UV-Licht die Terpenproduktion?",
            options = listOf("Es reduziert sie stark", "Es hat keinen Effekt", "Es kann die Produktion und Qualität der Terpene erhöhen"),
            correctAnswerIndex = 2
        )
    )
}
