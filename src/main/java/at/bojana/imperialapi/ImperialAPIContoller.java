package at.bojana.imperialapi;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImperialAPIContoller {
    public static void main(String[]args){
        class convert {
            static double Conversion_Inches_to_cm(int Inches)
            {
                double centimeter;
                centimeter  = 2.54 * Inches;
                System.out.printf("Value in Centimeter is: %.2f \n", centimeter);
                return 0;
            }
            public static void main(String args [])
            {
                int Inches = 20;
                Conversion_Inches_to_cm(Inches);
            }
        }

    }
}
