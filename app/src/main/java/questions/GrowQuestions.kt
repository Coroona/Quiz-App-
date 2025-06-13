package com.example.cannaquiz.questions


import com.example.cannaquiz.model.Question
object GrowQuestions{
val questions = listOf(

    Question(
        question = "Warum ist aktive Luftzirkulation wichtig beim Indoor-Grow?",
        options = listOf(
            "Verhindert zu viel Sauerstoff an den Wurzeln",
            "Hilft beim Harzaufbau der Blüten",
            "Reduziert Schimmelrisiko und stärkt Pflanzengewebe"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was sollte man mit Steinwolle-Würfeln vor dem Einsatz tun?",
        options = listOf(
            "In kochendem Wasser auswaschen",
            "Auf einen pH-Wert von ca. 5.5 einstellen",
            "Direkt trocken einsetzen"
        ),
        correctAnswerIndex = 1,

    ),
    Question(
        question = "Welcher Lichtzyklus wird typischerweise für die Blütephase verwendet?",
        options = listOf("16/8", "18/6", "12/12"),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Welche Luftfeuchtigkeit ist ideal in der späten Blütephase?",
        options = listOf("60–70 %", "30–35 %", "40–50 %"),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was passiert mit einer photoperiodischen Sorte bei >14 Std. Licht pro Tag?",
        options = listOf(
            "Sie geht direkt in die Blüte",
            "Sie stirbt wegen Lichtstress",
            "Sie bleibt in der Wachstumsphase"
        ),
        correctAnswerIndex = 2,

    ),
   Question(
        question = "Warum wird Stickstoff in der Blütephase reduziert?",
        options = listOf(
            "Weil er Schädlinge anzieht",
            "Weil er nicht mehr aufgenommen wird",
            "Weil er die Blütenbildung unterdrücken kann"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Welcher pH-Wert ist in Erde ideal für Nährstoffaufnahme?",
        options = listOf("5.0 – 5.5", "7.5 – 8.0", "6.0 – 7.0"),
        correctAnswerIndex = 2,

    ),


    Question(
        question = "Wie äußert sich ein Magnesiummangel zuerst?",
        options = listOf(
            "Gelbe Adern bei neuen Blättern",
            "Rostflecken an Rändern",
            "Vergilbung zwischen Adern älterer Blätter"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was ist ein gutes Ziel für Drainage-Menge bei Coco/Steinwolle?",
        options = listOf("0–5 %", "50–60 %", "10–20 %"),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Wozu dient die Berechnung des VPD im Growraum?",
        options = listOf(
            "Zur Messung der CO₂-Sättigung",
            "Um Lüfterlautstärke zu steuern",
            "Für optimales Verhältnis von Temperatur & Luftfeuchtigkeit"
        ),
        correctAnswerIndex = 2,

    ),
   Question(
        question = "Warum tendiert pH in Coco-Substraten zu steigen?",
        options = listOf(
            "Kalzium wird zu schnell aufgenommen",
            "Zu wenig Licht",
            "Coco bindet H⁺ und gibt Kationen ab"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was passiert bei falschem pH-Wert im Medium?",
        options = listOf(
            "Bessere Blütenbildung",
            "Höhere Trocknungsgeschwindigkeit",
            "Nährstoffsperre (Lockout)"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Welcher PPFD-Wert ist optimal in der Blütephase?",
        options = listOf("400–600", "200–350", "600–1000 µmol/m²/s"),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Optimale Temperatur in der Wurzelzone (Hydro)?",
        options = listOf("28–30 °C", "15–17 °C", "20–22 °C"),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Welche Makronährstoffe braucht die Pflanze am meisten?",
        options = listOf(
            "Kupfer, Zink, Bor",
            "Magnesium, Eisen, Schwefel",
            "Stickstoff, Phosphor, Kalium"
        ),
        correctAnswerIndex = 2,

    ),

    // 🔬 Level 3 – Experten / Technisch
    Question(
        question = "Warum benötigen Pflanzen in Coco oft Cal-Mag-Zusatz?",
        options = listOf(
            "Weil Coco Kalzium ausspült",
            "Weil es Stickstoff ausgleicht",
            "Weil Coco Kalzium & Magnesium durch Kationenbindung blockiert"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was ist der Kern (das „Stiel“) von Crop Steering?",
        options = listOf(
            "Anpassung der Lichtfarbe zur Beeinflussung der Photosynthese",
            "Gezielte Manipulation von Wasser- und Nährstoffgabe zur Steuerung von Pflanzenwachstum und Entwicklungsphasen",
            "Kontrolle der Luftzirkulation zur Vermeidung von Schimmel"
        ),
        correctAnswerIndex = 1,

    ),
    Question(
        question = "Was ist beim Klonen von Cannabispflanzen besonders wichtig?",
        options = listOf(
            "Die Stecklinge lange in der Sonne lassen",
            "Eine hohe Luftfeuchtigkeit und sanfte Bewässerung, um das Wurzelwachstum zu fördern",
            "Die Stecklinge direkt in vollgedüngte Erde setzen"
        ),
        correctAnswerIndex = 1,

    ),
    Question(
        question = "Woran erkennst du \"Air Pockets\" im Substrat?",
        options = listOf(
            "Übermäßiger pH-Wert",
            "Stehendes Wasser auf der Oberfläche",
            "Wurzeln wachsen unregelmäßig, lokale Trockenstellen"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was bewirkt stehendes Wasser + verdichtetes Medium?",
        options = listOf(
            "Sauerstoffüberschuss",
            "Nährstoffexplosion",
            "Wurzelfäule durch Luftmangel"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was ist bei Verwendung von hartem Wasser zu beachten?",
        options = listOf(
            "Es senkt automatisch den EC",
            "Es enthält keine Nährstoffe",
            "Es kann zu Kalziumüberschuss & pH-Anstieg führen"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was ist typischer EC-Wert für Blüte (Coco/Hydro)?",
        options = listOf("0.6 – 0.8", "2.8 – 3.5", "1.6 – 2.2"),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was ist bei Living Soil im Vergleich zu Hydro anders?",
        options = listOf(
            "Kein mikrobielles Leben vorhanden",
            "Düngung erfolgt täglich",
            "Nährstoffe werden durch Bodenleben langsam verfügbar gemacht"
        ),
        correctAnswerIndex = 2,

    ),
   Question(
        question = "Welche Mikroorganismen sind in Living Soil nützlich?",
        options = listOf("Algen", "Cyanobakterien", "Mykorrhiza & Rhizobakterien"),
        correctAnswerIndex = 2,

    ),
 Question(
        question = "Was bedeutet \"Buffering\" bei Coco?",
        options = listOf(
            "Nährstoffe werden entfernt",
            "CO₂ wird gespeichert",
            "Coco wird mit Ca²⁺/Mg²⁺ vorbehandelt, um Bindung zu verhindern"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Was ist ein typisches Anzeichen von Nährstoffsperre durch Salzansammlung?",
        options = listOf(
            "Schimmel auf der Erde",
            "Blätter werden dunkler grün",
            "Verbrannte Blattspitzen und schlechter Wuchs"
        ),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Warum ist Durchwurzelung bei Steinwolle entscheidend?",
        options = listOf(
            "Sie verbessert den Geschmack",
            "Verhindert Harzbildung",
            "Ohne gute Wurzelbildung staut sich Wasser & Nährstoffe bleiben ungenutzt"
        ),
        correctAnswerIndex = 2,

    ),
   Question(
        question = "Was ist ein Vorteil von Drain-to-Waste in Hydro-Systemen?",
        options = listOf(
            "Keine Nährstoffe werden verschwendet",
            "Es verhindert Schimmel",
            "Salze reichern sich nicht im Medium an"
        ),
        correctAnswerIndex = 2,

    ),
   Question(
        question = "Welche Wasserhärte ist ideal für sensiblen Grow?",
        options = listOf(">20 °dH (sehr hart)", "<2 °dH (extrem weich)", "6–8 °dH (mittelhart)"),
        correctAnswerIndex = 2,

    ),
    Question(
        question = "Warum sollte man bei Living Soil nicht ständig spülen?",
        options = listOf(
            "Weil es die Pflanze kühlt",
            "Weil es die Lichtaufnahme fördert",
            "Weil es Mikroorganismen und Nährstoffkreisläufe stören kann"
        ),
        correctAnswerIndex = 2,

    )
)
}
