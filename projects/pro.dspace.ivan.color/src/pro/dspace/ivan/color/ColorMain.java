package pro.dspace.ivan.color;

/**
 * Главный класс проекта.
 * 
 * @author Filin.PW
 *
 */
public class ColorMain {

	/**
	 * Точка входа в приложение.
	 * 
	 * @param args - опции запуска приложения
	 */
	public static void main(String[] args) {
		UserInterface ui = new UserInterface(args);
		CalcColor calcColor = new CalcColor(ui.getAmoColorCenter(), ui.getImageURL());

		if (calcColor.getIndicatorError()) {
			ui.printErrorMessage(calcColor.getErrorMesage());
		} else {
			ui.printResultMessage("Ok");
		}

	}
}
