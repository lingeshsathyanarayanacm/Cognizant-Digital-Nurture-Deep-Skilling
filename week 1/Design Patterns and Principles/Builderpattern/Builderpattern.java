class Computer{
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String GPU;

    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }
    public String getStorage() {
        return storage;
    }
    public String getGPU() {
        return GPU;
    }
    public static class Builder{
        private final String CPU;
        private final String RAM;
        private final String storage;
        private String GPU;

        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
public class Builderpattern {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .build();

        Computer officePC = new Computer.Builder("Intel i5", "16GB", "512GB SSD")
                .build();

        System.out.println("Gaming PC Configuration:");
        System.out.println("CPU: " + gamingPC.getCPU());
        System.out.println("RAM: " + gamingPC.getRAM());
        System.out.println("Storage: " + gamingPC.getStorage());
        System.out.println("GPU: " + gamingPC.getGPU());

        System.out.println("\nOffice PC Configuration:");
        System.out.println("CPU: " + officePC.getCPU());
        System.out.println("RAM: " + officePC.getRAM());
        System.out.println("Storage: " + officePC.getStorage());
        System.out.println("GPU: " + officePC.getGPU()); 
    }
}
