    public class Table {

        private final String material;
        private final String color;
        private final int nailNumber;

        public Table(String material, String color, int nailNumber) {
            this.material = material;
            this.color = color;
            this.nailNumber = nailNumber;
        }

        @Override
        public String toString() {
            return "Table{" +
                    "material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", nailNumber=" + nailNumber +
                    '}';
        }

        void demo() {
            System.out.println(this);
        }
    }