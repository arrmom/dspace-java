package pro.dspace.ivan.color;

//import java.awt.Component;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * Инструменты для работы с цветами и изображениями.
 * 
 * @author Filin.PW
 *
 */
public class CalcColor {

	/** количество цветовых центров */
	private int amoColorCenter;
	/** исследуемое изображение */
	private BufferedImage image;
	/** индикатор наличия ошибок */
	private Boolean indicatorError;
	/** сообщение об ошибке */
	private String errorMessage;

	/**
	 * Конструктор.
	 * <p>
	 * Задать количество цветовых центров и загрузить исследуемое изображение.
	 * </p>
	 * 
	 * @param amoColorCenter - количество цветовых центров
	 * @param imageURL       - URL исследуемого изображения
	 */
	public CalcColor(int amoColorCenter, String imageURL) {
		if (amoColorCenter >= 3 && amoColorCenter <= 7) {
			setAmoColorCenter(amoColorCenter);
			setIndicatorError(false);
			setErrorMesage("");
			downloadImage(imageURL);
		} else {
			setAmoColorCenter(-1);
			setIndicatorError(true);
			setErrorMesage("Количество цветовых центров должно быть в пределах от 3 до 7 включительно.");
			setImage(null);
		}
	}

	/**
	 * Загрузить исследуемое изображение. В случае ошибок зафиксировать факт их возникновения.
	 * 
	 * @param imageURL - URL исследуемого изображения
	 */
	private void downloadImage(String imageURL) {
		try {
			setImage(ImageIO.read(new URL(imageURL)));
		} catch (Exception e) {
			setIndicatorError(true);
			setErrorMesage("Невозможно получить изображение по данному адресу.");
		}
	}

	/**
	 * Получить сообщение об ошибке
	 * 
	 * @return сообщение об ошибке
	 */
	public String getErrorMesage() {
		return errorMessage;
	}

	/**
	 * Задать сообщение об ошибке
	 * 
	 * @param errorMesage - сообщение об ошибке
	 */
	private void setErrorMesage(String errorMesage) {
		this.errorMessage = errorMesage;
	}

	/**
	 * Получить состояние индикатора наличия ошибок.
	 * 
	 * @return состояние индикатора наличия ошибок
	 */
	public Boolean getIndicatorError() {
		return indicatorError;
	}

	/**
	 * Задать состояние индикатора наличия ошибок.
	 * 
	 * @param correctImage - состояние индикатора наличия ошибок.
	 */
	private void setIndicatorError(Boolean indicatorError) {
		this.indicatorError = indicatorError;
	}

	/**
	 * Получить количество цветовых центров.
	 * 
	 * @return - количество цветовых центров
	 */
	public int getAmoColorCenter() {
		return amoColorCenter;
	}

	/**
	 * Задать количество цветовых центров.
	 * 
	 * @param amoColorCenter - количество цветовых центров
	 */
	private void setAmoColorCenter(int amoColorCenter) {
		this.amoColorCenter = amoColorCenter;
	}

	/**
	 * Получить исследуемое изображение.
	 * 
	 * @return исследуемое изображение
	 */
	public BufferedImage getImage() {
		return image;
	}

	/**
	 * Задать исследуемое изображение.
	 * 
	 * @param image - исследуемое изображение
	 */
	private void setImage(BufferedImage image) {
		this.image = image;
	}
}
