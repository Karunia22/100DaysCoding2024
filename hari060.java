
import java.util.Scanner;
import java.util.Random;

public class hari060 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int finish = 100;
        int poin1 = 0;
        int poin2 = 0;
        int poin3 = 0;
        int poin4 = 0;

        boolean kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan pemain (1-4): ");
            int pemain = in.nextByte();

            switch (pemain) {
                case 1:
                    int daduKeluar = 0;
                    do {
                        int dadu = random.nextInt(6) + 1;
                        System.out.println("Dadu yang Keluar: " + dadu);
                        daduKeluar = dadu;
                        poin1 += dadu;
                        System.out.println("Poin sementara: " + poin1);
                        if (poin1 > finish) {
                            poin1 -= dadu;
                        }
                        if (poin1 == 8) {
                            poin1 -= 5;
                            System.out.println("Poin setelah kena jebakan: " + poin1);
                        } else if (poin1 == 14) {
                            poin1 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin1);
                        } else if (poin1 == 25) {
                            poin1 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin1);
                        } else if (poin1 == 53) {
                            poin1 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin1);
                        } else if (poin1 == 69) {
                            poin1 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin1);
                        } else if (poin1 == 89) {
                            poin1 -= 20;
                            System.out.println("Poin setelah kena jebakan: " + poin1);
                        } else if (poin1 == 97) {
                            poin1 -= 59;
                            System.out.println("Poin setelah kena jebakan: " + poin1);
                        }
                    } while (daduKeluar == 6);
                    break;
                case 2:
                    int daduKeluar2 = 0;
                    do {
                        int dadu = random.nextInt(6) + 1;
                        System.out.println("Dadu yang Keluar: " + dadu);
                        daduKeluar2 = dadu;
                        poin2 += dadu;
                        System.out.println("Poin sementara: " + poin2);
                        if (poin2 > finish) {
                            poin2 -= dadu;
                        }
                        if (poin2 == 8) {
                            poin2 -= 5;
                            System.out.println("Poin setelah kena jebakan: " + poin2);
                        } else if (poin2 == 14) {
                            poin2 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin2);
                        } else if (poin2 == 25) {
                            poin2 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin2);
                        } else if (poin2 == 53) {
                            poin2 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin2);
                        } else if (poin2 == 69) {
                            poin2 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin2);
                        } else if (poin2 == 89) {
                            poin2 -= 20;
                            System.out.println("Poin setelah kena jebakan: " + poin2);
                        } else if (poin2 == 97) {
                            poin2 -= 59;
                            System.out.println("Poin setelah kena jebakan: " + poin2);
                        }
                    } while (daduKeluar2 == 6);
                    break;
                case 3:
                    int daduKeluar3 = 0;
                    do {
                        int dadu = random.nextInt(6) + 1;
                        System.out.println("Dadu yang Keluar: " + dadu);
                        daduKeluar3 = dadu;
                        poin3 += dadu;
                        System.out.println("Poin sementara: " + poin3);
                        if (poin3 > finish) {
                            poin3 -= dadu;
                        }
                        if (poin3 == 8) {
                            poin3 -= 5;
                            System.out.println("Poin setelah kena jebakan: " + poin3);
                        } else if (poin3 == 14) {
                            poin3 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin3);
                        } else if (poin3 == 25) {
                            poin3 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin3);
                        } else if (poin3 == 53) {
                            poin3 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin3);
                        } else if (poin3 == 69) {
                            poin3 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin3);
                        } else if (poin3 == 89) {
                            poin3 -= 20;
                            System.out.println("Poin setelah kena jebakan: " + poin3);
                        } else if (poin3 == 97) {
                            poin3 -= 59;
                            System.out.println("Poin setelah kena jebakan: " + poin3);
                        }
                    } while (daduKeluar3 == 6);
                    break;
                case 4:
                    int daduKeluar4 = 0;
                    do {
                        int dadu = random.nextInt(6) + 1;
                        System.out.println("Dadu yang Keluar: " + dadu);
                        daduKeluar = dadu;
                        poin4 += dadu;
                        System.out.println("Poin sementara: " + poin4);
                        if (poin4 > finish) {
                            poin1 -= dadu;
                        }
                        if (poin4 == 8) {
                            poin4 -= 5;
                            System.out.println("Poin setelah kena jebakan: " + poin4);
                        } else if (poin4 == 14) {
                            poin4 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin4);
                        } else if (poin4 == 25) {
                            poin4 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin4);
                        } else if (poin4 == 53) {
                            poin4 -= 10;
                            System.out.println("Poin setelah kena jebakan: " + poin4);
                        } else if (poin4 == 69) {
                            poin4 -= 8;
                            System.out.println("Poin setelah kena jebakan: " + poin4);
                        } else if (poin4 == 89) {
                            poin4 -= 20;
                        } else if (poin4 == 97) {
                            poin4 -= 59;
                            System.out.println("Poin setelah kena jebakan: " + poin4);
                        }
                    } while (daduKeluar4 == 6);
                    break;
                default:
                    System.out.println("kelebihan pemain");
                    break;
            }
            if (poin1 == finish) {
                System.out.println("Pemenang: " + pemain);
                System.out.println("Total poin: " + poin1);
                kondisi = false;
            } else if (poin2 == finish) {
                System.out.println("Pemenang: " + pemain);
                System.out.println("Total poin: " + poin2);
                kondisi = false;
            } else if (poin3 == finish) {
                System.out.println("Pemenang: " + pemain);
                System.out.println("Total poin: " + poin3);
                kondisi = false;
            } else if (poin4 == finish) {
                System.out.println("Pemenang: " + pemain);
                System.out.println("Total poin: " + poin4);
                kondisi = false;
            } else {
                System.out.println("Pemain selanjutnya");
            }
            System.out.println();
        }

    }
}
