package variationjava;

class Mars {

    // Declare private static member variable as `final` to inform the
    // compiler that this value will never change.
    private static final Mars SINGLETON_INSTANCE = new Mars();

    // Make the constructor private to avoid any other instances of this class
    // From being created.
    private Mars() {

    }

    // Create a public static function that will return the static member
    // variable instance.
    public static Mars getSingleton() {
        return SINGLETON_INSTANCE;
    }
}
