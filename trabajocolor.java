public class AMCComputer {
    // Atributos
    private String processorBrand;
    private int ramSize;
    private int storageCapacity;
    private boolean hasSSD;

    // Constructor
    public AMCComputer(String processorBrand, int ramSize, int storageCapacity, boolean hasSSD) {
        this.processorBrand = processorBrand;
        this.ramSize = ramSize;
        this.storageCapacity = storageCapacity;
        this.hasSSD = hasSSD;
    }

    // Getters y Setters
    public String getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(String processorBrand) {
        this.processorBrand = processorBrand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public boolean hasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    // Métodos adicionales
    public boolean canRunGame() {
        return (processorBrand.equals("Intel") || processorBrand.equals("AMD")) && ramSize >= 8 && hasSSD;
    }

    public void upgradeRAM(int additionalRAM) {
        ramSize += additionalRAM;
    }

    public void upgradeStorageCapacity(int additionalCapacity) {
        storageCapacity += additionalCapacity;
    }
}
