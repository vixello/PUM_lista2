package pl.edu.uwr.lista_2

data class Module(
    val id: Int,
    val name: String,
    val crimeName: Crimes
)
data class Crimes (
    val title: String,
    val info: String,
    val indeks: String,
    val solved: Boolean //
)
 object DataProvider {
      val crimes = (listOf(
    //1
          Crimes("Ściąganie na teście", "Student nie przygotował się do testu i aby zdać próbował używać przygotowanych wcześniej pomocy naukowych","332441",false),
          Crimes("Kopiowanie kodu ze Stackoverflow", "Podejrzenie kopiowania kodu przez studenta ze strony forum. \n\nStudent przyznał się do korzystania z zasobów dodanych przez użytkowników forum. ","332443",true) ,
          Crimes("Student nie oddał listy w terminie","Student nie wywiązał się ze swojego obowiązku i oddał zadanie po terminie","332421",true),
          Crimes("Niewystarczająca ilość obecności", "Student przekroczył maksymalną liczbęnieobecności i będzie zmuszony powtarzać dany przedmiot","332241",false),
          Crimes("Zniszczenie mienia uniwersytetu", "Uniwersytet obciąża kosztami studenta, który zniszczył jego mienie.","322341",true),
    //5
          Crimes("Nie podstęplowanie legitimacji studenckiej","Student nie podstęplował swojej legityacji, przez co nie może korzystać z przywilejów studenta","332431",true),
          Crimes("Pobicie innego studenta","Student wdał się w bójkę ze studentem innego wydziału, nie zostało jeszcze ustalone, któy z nich ją zacząl","331231",false),
          Crimes("Nieopłacenie studiów","Student nie opłacił stduiów XX, przez co zostanie nie zostanie od dopuszoczony do ich zaliczenia","332861",true),
          Crimes("Nieprzyjście na egzamin","Student będzie musiał powtarzać egzamin, żeby zaliczyć przedmiot, ponieważ nie stawił sie na pierwszy termin","342571",true),
          Crimes("Nieoddanie sprawozdania na czas","Student nie oddał w czasie sprawozdania, przez co otrzyma 0 pkt.","342571",true),

          Crimes("Nieprzypięcie przedmiotów ","Student nie podpiał przedmiotów. Bez skontaktowania sięz dziekanatem, nie będą one rozliczone","345271",false),
          Crimes("Próba oszukania","Student prówał oszukać dziekanat podając zawyżoną średnią we wniosku o stypendium","356571",true),
          Crimes("Niewystarczająca ilość punktów ECTS","Student nie zdobył wystarcczającej liczby punktów ECTS, aby zaliczyć studia. Będzie on musiał je nadrobic zapisując się na przemdmiory nieobowiązkowe.","357531",false),
          Crimes("Zniszczenia mienia akademika","Studnent znisczył część mienia akademika pod wpływem alkoholu. Będzie musiał pokryć koszty naprawy","323411",false),
          Crimes("Niestawienie się na poprawę egzaminu","Student nie stawił się na poprawie egzaminu, przez co nie zdaje przedmiotu XX","323491",false),

          Crimes("Nielegalne sprzedawanie nagrań z wykładów","Student został złapany na odsprzedawaniu nagrań wykonanych podczas zajęć online","369932",true),
          Crimes("Przeszkadanie w prowadzeniu zaajęć","Student wraz z grupą znajomych uniemożlwa prowadząćemu prowadzenie zajęć (bycie za głośno, słuchanie muzyki).","342753",true),
          Crimes("Prześladowanie","Student prześladował innego studenta tego samego kierunku, co doprowadziło do opuszcania zajęc przez tego studenta.","342234",false),
          Crimes("Sprzedawanie używek","Student sprzedawał nielegalne używki innym studentom na terenie kampusu. Został on arsztowany","342123",true),
          Crimes("Podpalenie budynku uczelni","Student zostałzłapany na próbie podpalenia jednego z budynków uczelni. Przekazano go policji","342345",true),
          ))
      val modules: List<Module>
         get() = (0 until 19).map { Module(
             it,
             "Crime #${it+1}",
             crimes[it],
         ) }
 }
