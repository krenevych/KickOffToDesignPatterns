    public class Table extends Furniture {


        public Table(String material, String color, int nailNumber) {
            super(material, color, nailNumber);
        }

        @Override
        public String toString() {
            return "Table{" +
                    "material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", nailNumber=" + nailNumber +
                    '}';
        }


    }