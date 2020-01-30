GIT TELEPITESE:
https://git-scm.com/download/win


GIT HASZNALATANAK MEGISMERESE:
https://www.youtube.com/watch?v=XDKZu9kuEn8&list=PLyriihBWoulw1KQ2aM-NMnAoVPZevfmZq
Ez egy eleg korrekt video sorozat. 



A feladatban egy iskolat kell modellezni.

Hozz letre egy iskolat, adj hozza legalabb 4 tanart akik kozul ketto osztalyfonok,8 diakot,2 osztalyt, 4 tantargyat.
Tantargyak: Matematika, Informatika, Irodalom, Tortenelem.

Minden diak legalabb ketto tantargyat kedvencenek tart.
Minden tanar legalabb egy tantargyat tanit.
Minden tanarnak van legalabb egy osztalya.


Iskola:
    + nev : String
    + diakok : List<Diak>
    + tanarok : List<Tanar>
    + tantargyak : List<Tantargy>

Tanar:
    + nev : String
    + osztalyfonok : Boolean
    + szigoru tanar : Boolean
    + tanitott tantargy : Tantargy
    + tanitott osztaly : List<Osztaly>
    + feleltet() : String (Visszaadja, hogy megfelelt e a diak)

Osztaly:
    + nev : String
    + letszam : Byte
    + diakok : List<Diak>

Diak:
    + nev : String
    + eletkor : Byte
    + tanulmanyi atlag : Float
    + osztalyfonok: Tanar
    + tantargyak<Tantargy> : Tantargy
    + felel(Tantargy, Tanar) : String (Visszaadja, hogy megfelelt e a diak)

Matematika:
    + Nev : String
    + Nehezseg : 10 (Byte)

Irodalom:
    + Nev : String
    + Nehezseg : 2 (Byte)

Informatika:
    + Nev: String
    + Nehezseg: 6 (Byte)


FELELTETES MUKODESE: 
    + Ha a tantargy benne van a diak kedvencei kozott akkor 10, kulonben 5 a szorzo. (Tovabbiakban SZORZO)
    + Ha a tanar szigoru akkor 3 ha kedves akkor pedig 10 (tovabbiakban SZIGORUSAG)
    + Legyen egy random szam generator ami 1 es 15 kozott kisorsol egy erteket. Tovabbiakban: TUDAS
    (Ezzel szimulalva azt, hogy a gyerek mennyire tudja az aktualis anyagot.)
    + Ha a tantargy MATEMATIKA akkor a nehezsegi szint 40 (NEHEZSEG)
      Ha egyeb tantargy akkor pedig 10

        Az erdemjegy kiszamitasa: (SZORZO * (SZIGORUSAG + TUDAS)) - NEHEZSEG
            Ha ez a szam 0 es 150 kozott van akkor az eredmeny: NEM FELELT MEG.
            Ha ez a szam 150 felett van akkor pedig MEGFELELT.

Valassz ki egy tanart es feleltesD le azokat a diakokat akik ennek a tanarnak az osztalyaba tartoznak es ird ki a konzolra a diak nevet, milyen tantargybol felelt es mi lett az eredmeny!
    Pl: Roland, Matematika, MEGFELELT
