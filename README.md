# Shop simulator

Konzolos Java alkalmazás, amely egy bolti vásárlást szimulál.

A program bemenete parancssori argumentumként átvesz egy bevásárlókosarat és kiszámolja a fizetendő összeget a kosárban található elemek alapján.

A bolt különböző akciókat is szervez, amelyek akár hetente is képesek változni. Ezen a héten az
alábbi szabályok érvényesek:
- Ha valaki kettő A terméket vásárol és mellé vesz egy C-t is, akkor 1 darab C termék féláron
van. A második C termék már az eredeti áron kerül felszámolásra.
- D termék esetén kettőt fizet hármat vihet akciót hirdettek.
- Sajnos a helyi törvények miatt E termék nem vásárolható együtt D termékkel különleges adók
  nélkül. Ha ugyanabba a kosárba kerül E és D, akkor a vásárlás végösszege 30%-kal
  emelkedik.

## Plusz funkciók
- Bővíthető a kód új szabályokkal
- Bővíthető új termékekkel
- Példabemenetekkel tesztelve (JUnit)

## Példabemenetek
["A", "A", "B"] 130

["D", "D", "D", "D", "D"] 40

["D", "D", "D", "D", "D", "D"] 40

["A", "A", "D", "D", "C", "D", "C"] 220

["A", "A", "D", "D", "C", "D", "C", "E"] 344.5