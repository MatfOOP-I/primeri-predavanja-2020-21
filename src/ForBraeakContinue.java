
class ForBreakContinue {

    static void UgnjezdeniFor() {
        int znak = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int z = znak * (i + j);
                znak = -znak;
                System.out.print("\t" + z);
            }
            System.out.println();
        }
    }

    static void UgnjezdeniForBreakUnutrasnja() {
        int znak = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int z = znak * (i + j);
                znak = -znak;
                if (z > 4)
                    break;
                System.out.print("\t" + z);
            }
            System.out.println();
        }
    }

    static void UgnjezdeniForContinueUnutrasnja() {
        int znak = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int z = znak * (i + j);
                znak = -znak;
                if (z > 4)
                    continue;
                System.out.print("\t" + z);
            }
            System.out.println();
        }
    }

    static void UgnjezdeniForBreakSpoljasnja() {
        int znak = 1;
        kraj: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int z = znak * (i + j);
                znak = -znak;
                if (z > 4)
                    break kraj;
                System.out.print("\t" + z);
            }
            System.out.println();
        }
    }

    static void UgnjezdeniForContinueSpoljasnja() {
        int znak = 1;
        novaVrsta: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int z = znak * (i + j);
                znak = -znak;
                if (z > 4)
                    continue novaVrsta;
                System.out.print("\t" + z);
            }
            System.out.println();
        }
    }

    // улазна тачка програма
    public static void main(String[] args) {

        System.out.println("---");
        UgnjezdeniFor();

        System.out.println("---");
        UgnjezdeniForBreakUnutrasnja();

    }

}
