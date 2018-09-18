package pro.dspace.home.finalize;

/**
 * Эксперименты с методом finalize().
 * 
 * @author Filin.PW
 *
 */
public class IvanExperimentFinalize {

    /**
     * Класс с переопределённым методом finalize().
     * 
     * @author Filin.PW
     *
     */
    private class OverrideFinalize {

	/*
	 * (non-Javadoc) Сигнализировать о выполнении метода finalize().
	 * 
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
	    executeFinalize = true;
	    super.finalize();
	}
    }

    // Показатель выполнения метода finalize().
    private boolean executeFinalize;

    // Количество созданных классов до выполнения метода finalize().
    private int amoExemplarClass;

    /**
     * Конструктор по умолчанию.
     */
    IvanExperimentFinalize() {
	executeFinalize = false;
	amoExemplarClass = 0;
    }

    /**
     * Спровоцировать автоматический вызов метода finalize().
     */
    public void provokeExecuteFinalize() {
	do {
	    new OverrideFinalize();
	    // Отобразить количество свободной памяти в Java-машине после каждого создания
	    // объекта.
	    System.out.println(++amoExemplarClass + " - " + Runtime.getRuntime().freeMemory());
	} while (!executeFinalize);
	System.out.println("Метод finalize() выполнился. ");
    }

}
