package shapeIntr;

public class RectangleIntr implements ShapeIntr{
        private double width;
        private double height;
        private String fillColor;
        private String borderColor;

        public RectangleIntr (double width, double height, String fillColor, String borderColor) {
            this.width = width;
            this.height = height;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }

        @Override
        public double calculateArea() {
            return width * height;
        }

        @Override
        public String getFillColor() {
            return fillColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
}
