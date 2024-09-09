def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

def main():
    while True:
        print("Temperature Converter")
        print("1. Celsius to Fahrenheit")
        print("2. Fahrenheit to Celsius")
        print("3. Exit")

        choice = input("Enter choice (1/2/3): ")

        if choice == '3':
            print("Exiting...")
            break

        if choice in ['1', '2']:
            try:
                temperature = float(input("Enter the temperature: "))
            except ValueError:
                print("Invalid input. Please enter a numeric value.")
                continue

            if choice == '1':
                converted = celsius_to_fahrenheit(temperature)
                print(f"{temperature}°C is equal to {converted:.2f}°F")
            elif choice == '2':
                converted = fahrenheit_to_celsius(temperature)
                print(f"{temperature}°F is equal to {converted:.2f}°C")
        else:
            print("Invalid choice. Please choose a valid option.")

if __name__ == "__main__":
    main()
