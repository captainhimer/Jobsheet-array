package challenge_array_dua;
public class Challenge_array_dua 
{
    public static void main(String[]args)
    {
        int nilai[] = new int[5];
        nilai [0] = 60;
        nilai [1] = 70;
        nilai [2] = 80;
        nilai [3] = 90;
        nilai [4] = 100;
        double rata = 0.0;
        for(int i=0; i<nilai.length; i++)rata+=nilai[i];
            rata/=nilai.length;
            System.out.println("Nilai Rata rata = "+rata);
  
        System.out.println("\n---------Kategori Rata Rata---------");
        if(rata<75){
            System.out.println("Termasuk rata-rata rendah. \nNilai anda = "+rata);
        }else System.out.println("Termasuk rata-rata tinggi. \nNilai anda = "+rata);
    }
}

















