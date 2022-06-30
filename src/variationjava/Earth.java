package variationjava;

class Earth {

    // Have a private and static member variable to hold the singleton instance.
    private static Earth SINGLETON_INSTANCE;

    // Make the constructor private to avoid any other instances of this class
    // From being created.
    private Earth() {
    }

    // Create a public static function that will return the static member
    // variable instance. Check if it's null to initialize the instances once.
    static Earth getSingleton() {
        if (SINGLETON_INSTANCE == null) {
            SINGLETON_INSTANCE = new Earth();
        }
        return SINGLETON_INSTANCE;
    }


}
