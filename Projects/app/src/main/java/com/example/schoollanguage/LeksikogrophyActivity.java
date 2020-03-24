package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LeksikogrophyActivity extends AppCompatActivity {
TextView tV;
TextView textView;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leksikogrophy);
        tV = findViewById(R.id.tV);
        textView = findViewById(R.id.tV2);
        imageView = findViewById(R.id.image);
        Intent intent = getIntent();
        String t1=intent.getStringExtra("petr");
        tV.setText(t1);

        String t2 = "\n\n\nНЕОЛОГИЗМДЕРДИН СӨЗДҮГҮ\n\n\n" +
                "А. Жалиловдун “Кыргыз тилиндеги жаңы сөздөрдүн сөздүгү”: (Биринчи китеп, Ош, 1998, 70 бет, 2000 нускада) жарык көргөн. Мында “80-жылдардын экинчи жарымынан тартып, азыркы учурга чейинки кыргыз тилинин лексикографиясында пайда болгон жаңы сөздөр, сөз айкалыштары жана сөз мамилелери камтылды” (аталган эмгек, 4-б.). Мындай эмгек улам толукталып– такталып, кайрадан басылып чыгып турса, турмуштук өнүгүүнү коштоп- колдоп турмак.\n" +
                "\n\n\nОРФОЭПИЯЛЫК СӨЗДҮКТӨР\n\n" +
                " Мындай эмгек адабий тилдеги сөздөрдүн айтылыш – нормасын жөнгө салууга, сүйлөө (оозеки) маданиятын калыптандырууга, сүйлөө этикасын сактоого арналган. Бүгүнкү күндө аталган багытка карата кыргыз орфоэпиясына байланыштуу айрым изилдөөлөр, ойлор айтылганына карабастан, мындай эмгек түзүүлө да, жарыялана элек, бирок ал турмуштук зарылдыктын чегинде турат.\\n\" +\n" +
                " \n\n\nЖЫШТЫК СӨЗДҮКТӨР\n\n\n" +
                "Тилдеги сөздөрдүн активдүүлүгүн/жыштыгын аныктоого багытталат. " +
                "Мындай сөздүккө профессор Карабоз Дыйканов “Манас” эпосунун алфавиттүү жиги сөздүгү:- (1-бөлүк.- Фрунзе: КМУ, 1988.- 134 б. “Манас” эпосунун жиги алфавиттүү лугаты: ΙΙ бөлүк, Фрунзе, 1988) деген эмгектерин көрсөтүүгө болот. Алар мындай багыттагы эмгектердин саамалыгы болуп саналат.\\n\" +\n" +
                "Мындай сөздүк чет тилди үйрөнүүдө/үйрөтүүдө, окуу китептерин жазууда, " +
                "окуу процессине байланыштуу сөздүк түзүүдө керектелет. Ысык-Көл мамлекеттик университети ушундай эмгек " +
                "жаратууга аракеттенгендиги тууралуу маалыматтар бар.\n" +
                "\n\n\nКЕРИ / ТЕСКЕРИ СӨЗДҮКТӨР\n\n\n" +
                "К. Дыйканов түзгөн “Кыргыз тилинин терс жана кери алфавиттүү сөздүгү” " +
                "(Алма-Ата: Наука / Гылым, 1989.- 456 б.)\n" +
                "ушул багытка туура келет. Мында сөздөр аяккы тамгасы боюнча (сен-нес; кыргыз-зыгрык; кет-тек) иреттелет да," +
                "көбүнчө ырлардын уйкалыштыгы үчүн кызмат кылат." +
                "\n\nКыргыз лексикографиясында сөздүк түрүндө жарыяланган, бирок (азырынча) кайсы топко (түргө) кошууга мүмкүн болбогон көрүнүштөр да учурайт: А.Осмонкулов “Лингвистикалык жана методикалык терминдердин кыскача сөздүк справочниги” (Б., 1993); А. Осмонкулов, П.И.Харакоз. “Русско-киргизский гнездовой словарь” (1993, 368 бет); А. Осмонкулов, " +
                "К.А. Абалбеков. “Сөздүк-справочник” (Фрунзе: Мектеп, 1971, 331 бет) жана башкалар." +
                "\n\n\nПАРЕМИОЛОГИЯЛЫК СӨЗДҮК\n\n" +
                "Филологиялык сөздүктөрдүн дагы бир бөтөнчө түрүн макал-ылакаптар, учкул сөздөр түзөт. Бул бөлүккө, бөлүнүшкө төмөнкү эмгек мисал болот, тактап айтканда: Ибрагимов М.Т. Кыргыз макал-ылакап, учкул сөздөрү (10551 фразеологиялык бирдик).- Кара-Балта, 2005. – 500 б.\n" +
                "Аталган эмгек кыргыз элинин түбөлүктүү көркөм маданиятын – макалдары менен ылакаптарын, учкул сөздөрүн топтоого арналган бөтөнчө нускалуу китеп, фундаменталдуу улуттук сыймыктуу чыгарма. Бул залкар эмгек жарыкка чыкканга чейин мындай багыттагы чакан эмгектер жарыяланган. М.Ибрагимовдун (1939-2008) аталган жыйнагы журтубуздун көрөңгөлүү көркөм дүйнөсү, кубулжума керемет педагогикалуу, программалуу багыты. Ал салттуу-алфавиттик принципте жана ар бир нускалуу бирдик (варианттуулугуна карабастан), номер (сан бирдиги) менен коштолгон- туташтырылган-түзүлгөн. Бул анын оригиналдуулугун дүйнөлүк талапка жакын тургандыгын шарттаган.\n" +
                "Сөз болгон китептин чыгышына таанымал түрколог Кадыралы Коңкобаевдин түйшүгү зор.\n" +
                "\n\n100 (жүз) жылдай илимий чөйрөгө белгисиз болуп келген, жакында" +
                "Түркиядан табылган, И[Э]шмамат Букиндин 1883-жылы Ташкентте басылган “Кыргыз сөздүгү” кызыгууну жаратат. (Жумакунова Гүлзуура “XIX кылымда кыргыз жигити даярдаган “Кыргыз сөздүгү” Туркиядан табылды”) // Кыргыз туусу, 2009-жыл 10-февраль, 10-бет.\n" +
                "Окумуштуу Г.Жумакунованын аталган макаласында: “Практикалык жактан колдонула турган бир булактын, илим жана басма сөз дүйнөсүндө да кыргыз тилине тиешелүү бир сөздүктүн жоктугу муну даярдашыма түрткү берди. Бул эмгегимди жарыялап жатып улутташтарым (түркчө-ыракташтарым) кыргыздарга, азиз мекендештерим орустарга эки тилде тең (мубаделек ефкары) котормо түшүнүгүн жеңилдетүүнү көздөдүм. Түркстан мугалимдер окуу жайы, IV курс студенттеринен Ишмехмет Букин 9.11.1882.Ташкент”.\n" +
                "Келтирилген мисалдан-маалыматтан улам аталган эмгекти лейлектик " +
                "Эшмат деген билимдүү киши жазгандыгына ыктайбыз, себеби:\n" +
                "\n1. Азыркы Лейлек районунун Булак-Башы (эски Сүлүктү) – Калцо кыштагында – Кыргызстанда биринчи жолу Улуу Октябрь Социалисттик революциясы орногон.\n" +
                "\n2. Булак-Башы кыштагында ичкилик кыргыздардын ичине кирген тейит уруусу (мурда жана азыр) жашайт. Ал жерде Газбек, Эшмаат сыяктуу билимдүү адамдар жашаган, алардын урпактары азыр деле мекендешет.\n" +
                "\n3. Сүлүктү шаарына темир жол ушул – Булак-Башы кыштагынан өткөн.\n" +
                "\n4. Булак-Башыда Эшмаат деген кишинин 4-5 уул балдары 45-70 жаш\n" +
                "аралыгында жогорку математикалуу билимдүү болгон. Ушул кезде анын уулдары (мисалы, Жамал Жаанбаев) АКШда, Бишкекте, Ошто (ЖОЖдордо) профессор болуп иштешет." +
                "\n\nУшул эле профессор Г. Жумакунованын маалыматына таянып, кыргыз тили\n" +
                "илиминде сөздүк түзүү иши ΧΙΧ кылымдын 90-жылдары башталгандыгын белгилегибиз келет." +
                "\n\nБиз “Азыркы кыргыз тилинин лексикологиясы, лексикографиясы” деген\n" +
                "эмгегибизден алыстап кетпес үчүн, алынган теманы токтотобуз, келечекте ага илимпоздордун кайрылышына ишенчибиз чоң.\n" +
                "Жазмасы бар, өнүккөн, өнүгүп бара жаткан дүйнө элдеринде филологиялык" +
                " сөздүктөр түрдөнүп жана толукталып турган эмгектерден болуп саналат. Мунун өзү элдин жазма," +
                " жаңы маданиятын жана менталитетин улам биийк денгээлге, баскычка багытталып тургандыгын билдирет." +
                "\n\n\nIII. ОНОМАСТИКАЛЫК СӨЗДҮКТӨР\n\n" +
                "Ономастикалык сөздүктөрдө энчилүү аттардын жазылышы, таралышы, тутамы, жасалышы, лексикалык өзөгү, онимизация процесси, онимдик негиз жана ономастикалык омонимия жөнүндө сөз болот. Ономастикалык сөздүктөр 1979-жылдан жарык көрө баштаган.\n" +
                "Кыргыз ономастикасында кеңири керектелген жана түзүлгөн эмгектер – топонимдик жана антропонимдик сөздүктөр. Алардын бир нече практикалык багыттагы варианттары түзүлгөн.\n" +
                "Кыргыз ономастикасы боюнча төмөндөгүдөй эмгектер жаралган (чечмелеп айтканда, бул эмгектердин түздөн-түз жана кыйыр болсо да тийешеси бар): “Кыргыз адам аттарынын сөздүгү” (1979), “Кыргыз жергеси” (1990), “Словарь географических названий Киргизской ССР” (1988), “Адам аттары –эл байлыгы” (2004, 2009).\n" +
                "Ономастикалык сөздүктөр – энчилүү аттар (аталыштар) тууралуу эмгектер болгондуктан, алардын пайда болушу бул багыттагы изилдөөлөргө, алардын жыйынтык-натыйжаларына, турмуштук зарылдык менен муктаждыктан улам келип чыккан.\n" +
                "Жумагулов Ч., Исабекова А. Ономастикалык терминдердин орусча- кыргызча сөздүгү = Русско-киргизский словарь ономастических терминов (Фрунзе: Илим, 1985.- 77 б.) деген китеби ономастика илиминин түптөлүшүнө өз үлүшүн кошкон эмгек.\n" +
                "Кыргыз ономастикасында кеңири керектелген жана түзүлгөн эмгектер – топонимдик жана антропонимдик " +
                "сөздүктөр. Алардын бир нече практикалык багыттагы варианттары түзүлгөн." +
                "\n\n\nТопонимикалык сөздүктөр жана эмгектер\n\n" +
                "“Кыргыз жергеси” (Энциклопедия, 1990), 3762 макаланы/топонимди камтыйт. Учурдун көйгөйлүү талабына ылайык - топонимдердин кыргызча жазылышын аркалайт, автордук жамаат түзгөн. Сөз болуп жаткан китепте\n"+
                "топонимдерге негизинен тарыхый, географиялык, экономикалык, экологиялык маалыматтар арбын берилген. Кайталанып (толукталып-такталып) али басыла элек.\n" +
                "Ал эми “Кыргыз ССРиндеги [Кыргыз мамлекетиндеги – Ш.Ж., Т.С.] географиялык аттардын сөздүгү” (1988), кыргызча-орусча жазылган, 5200 топоним берилип, байланыш, басма сөз, маданият, транспорт, юриспруденция кызматкерлерине арналган. Аталган “Кыргыз жергеси” (1990), “Кыргыз ССРиндеги географиялык аттардын сөздүгү” (1988, Сулайманова Л.С. Кыргызско-русский словарь народных географических терминов Кыргызстан.- Б.: Лакиринт, 2002.- 66 с.) деген эмгектер - кыргыз өлкөсүндө илимдин бул багытынын мыкты эле жана илимий негизде өнүгүп бара жаткандыгынан жар салат.\n" +
                "Жаш топонимист - изилдөөчүлөр Л. Сулайманованын “Лингвистический анализ народных географических терминов в топонимии Кыргызстана” (2008), М. Шамшиеванын “Кыргыз тилинин Лейлек топонимдери” (2009) деген эмгектери али илимде реализациялана элек, практикада колдонууга багыттала элек. Жаш илимпоз Нурбек Акматовдун “Ысык-Көл” топонимиясы” (Каракол, 2009, 244 б.), ушул эле илимпоздун “Ысык-Көл жер-суу аттарынын сөздүгү” (Каракол, 2009, 224 б.) деген китеби кыргыз ономастикасы үчүн кызыктуу.\n" +
                "\n\n\nІV. ТЕРМИНОЛОГИЯЛЫК-ТАРМАКТЫК СӨЗДҮКТӨР\n\n" +
                "Терминологиялык-тармактык сөздүктөр максаты, түзүлүш принциптери боюнча энциклопедиялык сөздүктөргө бир аз жакын.\n" +
                "Кыргыз тилинде терминологиялык-тармактык сөздүктөр 20-жылдардын аягында - 30-жылдардын башында чыга баштаган. Алар негизинен орусча- кыргызча, сейрек кыргызча-орусча түрүндө, өтө сейрек, накта кыргызча болгон.\n" +
                "XX кылымдын 60-жылдарынан баштап бир тилдүү түшүндрмөлүү терминологиялык-тармактык кыргызча сөздүктөр түзүлө баштаган жана алар 80-90-жылдары жанданган. Бүгүнкү күндө (2010-жылдын аягында) КРнын УИАсынын Терминология секторунда 150гө жакын ар кандай терминологиялык-тармактык сөздүк жарык көргөн. Алардын бир тобу алгач долбоор түрүндө даярдалып, талкуудан өтүп, анан басылып чыккан. Учур жана илим тарабынан караганда мындай көрүнүш өзүн-өзү актаган.\n" +
                "Терминологиялык-тармактык сөздүктөр төмөндөгүдөй топторго бөлүнөт жана аларга лексикографиялык өңүттөн ой жүгүртүүдө хронологиялык (ошондой эле алфавиттик) принцип эсепке алынат.  " +
                "\n1. Физика-математикалык илимдер боюнча сөздүктөр. \n2. Химия илимдери боюнча сөздүктөр.\n" +
                "3. Биология илимдери боюнча сөздүктөр.\n" +
                "4. Геология-минерология илимдери боюнча сөздүктөр. \n5. Техника илимдери боюнча сөздүктөр.\n" +
                "6. Айыл-чарба боюнча сөздүктөр.\n" +
                "7. Ветеринария илимдери боюнча сөздүктөр\n" +
                "8. Тарых илимдер боюнча сөздүктөр.\n" +
                "9. Экономика илимдери боюнча сөздүктөр.\n" +
                "10. Филология илимдери боюнча сөздүктөр.\n" +
                "11. Философия илимдери боюнча сөздүктөр.\n" +
                "12. География илимдери боюнча сөздүктөр.\n" +
                "13. Юридика, укук илимдери боюнча сөздүктөр.\n" +
                "Укук: (Кыскача энциклопедия).- Фрунзе: КСЭ. 1988, 496 б.\n" +
                "14. Педагогика илимдери боюнча сөздүктөр.\n" +
                "15. Медицина илимдери боюнча сөздүктөр.\n" +
                "16. Политология, социология, психология, исскуство илимдери боюнча\n" +
                "сөздүктөр.\n" +
                "Акунов А., Ожукеева Т. [ж.б.]. Политология: (Кыскача сөздүк). Б., 1996.\n" +
                "17. Физкультура жана спорт боюнча сөздүктөр.\n" +
                "«Физкультура жана спорт»: (Энциклопедия, Б., 2002, 236 б.). Бул эмгек\n" +
                "1000 нуска менен жарык көргөн жана 500 макаладан турат. Мында дене-тарбия жана спорт боюнча негизги терминдер, спорт тарыхы, Кыргызстандагы көрүнүктүү спортчулардын өмүр баяны камтылган.\n" +
                "18. Аскер ишине байланыштуу сөздүктөр.\n" +
                "19. Экология, жаратылышка мамиле жасоо боюнча сөздүктөр.\n" +
                "20. Гидротехника боюнча сөздүктөр.\n" +
                "21. Дин иштери, религия боюнча сөздүктөр.\n" +
                "22. Компьютер боюнча сөздүктөр.\n" +
                "23. Маданият боюнча сөздүктөр.\n" +
                "24. Архитектура боюнча сөздүктөр.\n" +
                "25. Ишкердик боюнча сөздүктөр.\n" +
                "26. Транспорт боюнча сөздүктөр.\n" +
                "27. Ар кандай багыттагы сөздүктөр.\n" +
                "28. Экзотикалык мүнөздүү сөздүктөр." +
                "\nУшул кезде кыргыз тилине жана кыргыз турмушуна байланыштуу\n" +
                "сөздүктөр уланып, улам толукталып чыгып жаткандыгына күбө болобуз. Биздин баамыбызда, мындай көрүнүш турмуш менен, илим менен кошо\n" +
                "арыштап бара жатат. Демек, мындай абалды жагымдуу жагдай десек болчудай. Мындай типтеги сөздүктөр, бүгүнкү күндүн - 2010-жылдын бийиктигинен, деңгээлинен караганда, глобализациянын (ааламдаштыруунун) контекстинен\n" +
                "алганда, жемиштүү өнүгүп-өсүп бара жатат.\n" +
                "Ушул мезгилде Кыргыз Республикасында сөздүк түзүү, түзүлгөн\n" +
                "сөздүктөрдү басып чыгаруу жана аларды сактап туруу, сатуу иштери колго алынбаган, жолго салынбаган, кайдыгерчилик кабылып турган абалда.\n" +
                "\n\nЖогорудагы “ТАРМАКТЫК-ТЕРМИНОЛОГИЯЛЫК СӨЗДҮКТӨРДҮН” ичинен “10. Филология илимдери боюнча сөздүктөрдүн” арасынан биздин кесиптикбагытыбызга“Синонимдик сөздүк”жакынтурат.Мына ошондуктан бул жерде ага мүнөздөмө берсек эп болчудай." +
                "Жашоодо, турмушта кеңири керектеле турган филологиялык өздүктөрдүн бири синоним (синонимдик) сөздөрдүн сөздүгү. Аны Ш. Жапаров менен К. Сейдакматов түзгөн: “Кыргыз тилинин синонимдер сөздүгү” (Фрунзе, “Илим”, 1984.- 470 бет) 30 басма табак көлөмүндө, 2000 нускада жарык көргөн. 7000 жакын азыркы кыргыз адабий тилиндеги синонимдер камтылып, алардын колдонулушуна, маанисине, өз ара катышына лингво-стилистикалык, семантикалык мүнөздөмө берилип, колдонулушундагы активдүүлүгүнө карай жайгаштырылып, стилистикалык чечмелөө берилип – турмуштун бул же тигил алкагында керектелишине жараша түшүнүк коштолуп, ар бир синоним сөз текст менен шөкөттөлөт жана синоним деген категорияга аныктама берилет: айтылышы ар башка келип, бирдей же бири-бирине жакын түшүнүктү билдирген сөздөр СИНОНИМДЕР деп аталат." +
                "\nСИНОНИМДЕРДИН мүнөздүү белгилери төмөнкүлөр:" +
                "\na) семантикасы бирдей түшүнүктү же бири-бирине жакын кубулушту, көрүнүштү, нерселердин, буюмдардын аттарын билдириши;\n" +
                "б) морфологиялык жактан бир сөз түркүмүнө таандык болушу;\n" +
                "в) тыбыштык түзүлүшү жана морфемалык куралышы боюнча ар башка болушу;\n" +
                "г) синтаксистик жагынан бирдей сүйлөмдүн мүчөсүнүн милдетин аткарышы. (Аталган аныктамаларды далилдеш үчүн адам-киши, сакта- корго деген синонимдер анализдесек)." +
                "Бул а к а д е м и я л ы к мүнөздөгү сөздүктүн аягында (403-463-\n" +
                "беттеринде) синонимдердин көрсөткүчү (индекси) берилет. Мындай эмгек кайталанып-толукталып, кайра басыла элек. Аталган эмгекке карата учурунда көп жылуу, илимий пикирлер айтылган." +
                "\n\n\nV. АЙМАКТЫК СӨЗДҮКТӨР\n\n" +
                "Аймактык (чөлкөм таануу багытындагы) сөздүктөрдүн семантикалык- лексикалык өзөгүндө филологиялык, ономастикалык сөздүтөрдүн базалык (фундаменттик) негиздер айкалыша, чырмалыша жайгашкан. Дал мына ошондуктан аларды жаңы типтеги көрүнүшкө кошууга негиз түзүлгөн.\n" +
                "2009-жылдын аягында (XII) Кыргыз Республикасынын Административдик бөлүнүшү боюнча (Х.Карасаев. Кыргыз тилинин орфографиялык сөздүгү.Б.,2009, 598 б.): 7 (жети) область; 40 (кырк) район; 16 (он алты) шаар, 493 (төрт жүз токсон үч) айыл өкмөтү бар. Мындай эмгектер регионалдык- географиялык мүнөздөгү энциклопедиялык сөздүктөрдүн тобуна кирип, максаты мекен-өлкө таануу сабагын окутуу менен байланышып, окуучуларды жерди сүйүү, анын байлыктарын урматтоого багытталган, патриотизмди калыптандырууну аркалайт.";
        textView.setText(t2);
    }
}