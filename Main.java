public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        // Her elemanın frekansını hesaplamak için bir dizi kullanıyoruz.
        int[] frequencies = new int[arr.length];

        // Her elemanın frekansını hesaplayıp frequencies dizisine kaydediyoruz.
        for (int i = 0; i < arr.length; i++) {
            int count = 1; // Her elemanın frekansını saklamak için bir sayaç başlatıyoruz.

            // Daha önce işlenmişse geçiyoruz.
            if (frequencies[i] == -1) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequencies[j] = -1; // İşlendi olarak işaretliyoruz.
                }
            }

            frequencies[i] = count;
        }

        // Sonuçları ekrana yazdırıyoruz.
        for (int i = 0; i < arr.length; i++) {
            if (frequencies[i] != -1) {
                System.out.println(arr[i] + " elemanı " + frequencies[i] + " kez tekrar edildi.");
            }
        }
    }
}