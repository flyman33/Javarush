package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes image) {

            if(!(image instanceof ImageTypes)){
               throw new IllegalArgumentException("Неизвестный тип картинки");
            }
            if(image == ImageTypes.JPG) {
                return new JpgReader();
            } else if(image == ImageTypes.BMP) {
                return new BmpReader();
            } else return new PngReader();
    }

}
