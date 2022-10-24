public class Main {
//    public static void main(String[] args) {
//
//    }
    public static class FaceWash {
        private String towelColor;
        private int water_tempt;
        private int wash_time;

    public FaceWash(String towelColor, int water_tempt, int wash_time) {
        this.towelColor = towelColor;
        this.water_tempt = water_tempt;
        this.wash_time = wash_time;
    }


    public static void main(String[] args) {
        FaceWash morning_face_wash = new FaceWash("red",2,3);
        FaceWash evenening_face_wash = new FaceWash("yellow",23,2);
    }

    }
}