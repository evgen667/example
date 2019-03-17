import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ConvertImageFile {
    public static void main(String[] args) {
        imgconv();
    }

    public static void imgconv() {
//    }

 //   public static void main(String[] args) {
        BufferedImage bufferedImage;
        try {
            //Считываем изображение в буфер
            bufferedImage = ImageIO.read(new File("e:\\devcolibri.png"));

            // создаем пустое изображение RGB, с тай же шириной высотой и белым фоном
            BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),
                    bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
            newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);

            // записываем новое изображение в формате jpg
            ImageIO.write(newBufferedImage, "jpg", new File("e:\\devcolibri.jpg"));

            System.out.println("Готово!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
