package LearnPackage;

public class CleanHint {

    // -- Упрощение кода

    //return kelvin < 273 ? true : false;
    //return kelvin < 273;

    // -- Тесты

    // От том что элемент недоступен можно узнать с помощью выражения:
    // ассерт фолс, в случае если элемен не тру, сам выбросит исключение
    //Assert.AssertFalse(el.Enable)

    // В юнит тестах не нужны циклы и низкоуровневая логика, только линейность
    // Юнит тесты запускаются в методах, в мейне не нужно
    // Параметры в тестах передаются внутри

    //Пример
//    public void sampleTest(){
//        Triangle triangle = new Triangle();
//        assertTrue(triangle.check(5,4,3));
//    }

    // соут тоже лучше исключать, чтобы не читать лишнего



}
