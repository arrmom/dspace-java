package pro.dspace.ivan.color;

/**
 * Пользовательский интерфейс.
 * 
 * @author Filin.PW
 *
 */
public class UserInterface {

	/**
	 * Число цветовых центров по умолчанию (если не задано).
	 */
	private static final int DEFAULT_COLOR_CENTER = 3;

	/** количество цветовых центров */
	private int amoColorCenter = DEFAULT_COLOR_CENTER;

	/** URL исследуемого изображения */
	private String imageURL = "https://avatars0.githubusercontent.com/u/3118968";

	/** индикатор правильности указания опций */
	private Boolean correctOptions = true;

	/**
	 * Конструктор.
	 * <p>
	 * Обработать входные параметры.
	 * </p>
	 * 
	 * @param args - входные параметры
	 */
	public UserInterface(String[] args) {
		for (int i = 0; i < args.length; i++) {
			try {
				switch (args[i]) {
				case "-acc":
					setAmoColorCenter(Integer.parseInt(args[++i]));
					break;
				case "-iurl":
					setImageURL(args[++i]);
					break;
				case "-h":
					printAboutProgram();
					break;
				default:
					errorOptions();
					i = args.length;
				}
			} catch (Exception e) {
				errorOptions();
				break;
			}

		}
	}

	/**
	 * Зафиксировать попытку некорректного задания опций и предупредить пользователя.
	 */
	private void errorOptions() {
		setCorrectOptions(false);
		System.out.println("Опции заданы неверно.\n");
		printOptions();
	}

	/**
	 * Отобразить сообщение об ошибке.
	 * 
	 * @param msg - сообщение об ошибке
	 */
	public void printErrorMessage(String msg) {
		System.out.println(msg);
	}

	/**
	 * Отобразить сообщение о результате выполнения программы.
	 * 
	 * @param msg - информация о результате вычислений
	 */
	public void printResultMessage(String msg) {
		System.out.println(msg);
	}

	/**
	 * Отображение информации о программе
	 */
	private void printAboutProgram() {
		System.out.println("Определение доминирующих цветов в изображении методом кластеризации k-средних.");
		System.out.println("Краткое описание алгоритма:");
		System.out.println(
				"\t1) Случайным образом выбирается несколько пикселей изображения - цветовых центров (3 - 7 штук).");
		System.out.println(
				"\t2) Все прочие пиксели распределяются по этим центрам на основании их близости к тому или иному центру.");
		System.out.println(
				"\t3) Определяется среднее цветовое значение для каждого из центров. Полученные зачения будут новыми цветовыми центрами.");
		System.out.println(
				"\t4) Пункты 2 и 3 повторяются до тех пор, пока значения цветовых центров не перестанут меняться.");
		System.out.println(
				"\t5) Сравнивая итоговое количество пикселей, соотнесённых каждому из цветовых центров, можно определить какие цвета и на сколько преобладают в изображении для данного количества центров.\n");
		printOptions();
	}

	/**
	 * Отображение доступных опций.
	 */
	private void printOptions() {
		System.out.println("Доступные опции:");
		System.out.println("-acc");
		System.out.println(
				"\tКоличество цветовых центров. Допускается значение в пределах от 3 до 7 включительно (по умолчанию "
						+ getAmoColorCenter() + ");");
		System.out.println("-iurl");
		System.out.println("\tURL исследуемого изображения (по умолчанию " + getImageURL() + ");");
		System.out.println("-h");
		System.out.println("\tСправочная информация.");
	}

	/**
	 * Получить количество цветовых центров.
	 * 
	 * @return количество цветовых центров
	 */
	public int getAmoColorCenter() {
		return amoColorCenter;
	}

	/**
	 * Задать количество цветовых центров
	 * 
	 * @param amoColorCenter - количество цветовых центров
	 */
	private void setAmoColorCenter(int amoColorCenter) {
		this.amoColorCenter = amoColorCenter;
	}

	/**
	 * Получить URL исследуемого изображения.
	 * 
	 * @return URL исследуемого изображения
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * Задать URL исследуемого изображения.
	 * 
	 * @param imageURL - URL исследуемого изображения, не {@code null} и не пусто
	 */
	private void setImageURL(String imageURL) {
		if (imageURL == null || imageURL.isEmpty()) {
			throw new IllegalArgumentException("imageURL must not be null or empty");
		}
		this.imageURL = imageURL;
	}

	/**
	 * Получить состояние индикатора правильности указания опций.
	 * 
	 * @return состояние индикатора правильности указания опций.
	 */
	public Boolean getCorrectOptions() {
		return correctOptions;
	}

	/**
	 * Задать состояние индикатора правильности указания опций.
	 * 
	 * @param correctOptions the correctOptions to set
	 */
	private void setCorrectOptions(Boolean correctOptions) {
		this.correctOptions = correctOptions;
	}
}
