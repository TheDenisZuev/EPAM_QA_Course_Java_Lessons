package LearnPackage.Exception;

public class LearnExceptionAssert {
    public static void main(String[] args) {
        // идея ассертом проверяется предыдущее утверждение
        // если ок - дальше блок кода, не ок - ошибка
        // аналогия с if {length >= 0} else {exception}
        // включить режим ассерта Run-Config-VM option - установить -ea
        int length = -1;
        assert (length >= 0) : "test text";
        // positive scenario


    }
}
