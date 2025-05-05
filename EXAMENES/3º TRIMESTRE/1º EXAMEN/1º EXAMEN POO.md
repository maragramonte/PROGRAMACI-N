Implementa en Java una aplicación que simule el funcionamiento de un sistema bancario con tarjetas según los requisitos siguientes.

Crea una clase abstracta Tarjeta con los atributos: numeroTarjeta y saldoDisponible. 
Implementa métodos para:
• Consultar los atributos.
• Realizar un cargo.
• Realizar un abono.
• Transferir saldo disponible de una tarjeta a otra.

En relación a los tres últimos, debe existir un método más, llamado añadir, que añada una cantidad (positiva o negativa) al saldo disponible. Fíjate en el diagrama UML del final.

Además habrá un atributo común a todas las instancias llamado interesMensualBasico, que debe ser constante.

La clase debe ser abstracta y debe contener un método llamado calcularIntereses().

También se debe implementar un método para mostrar los datos de la tarjeta llamado toString().

De esta clase heredarán dos subclases: TarjetaDebito y TarjetaCredito.

La diferencia entre ambas será la manera de calcular los intereses:
• A la primera se le aplicará un interés fijo mensual básico sobre los cargos realizados.
• La segunda tendrá una constante (propiedad final) de clase llamada saldoMinimo. Si el saldo disponible es inferior a este saldo mínimo, el interés será el doble del interés básico mensual. Si el saldo disponible supera el saldo mínimo, el interés aplicado será la mitad del interés básico mensual.

No olvidéis implementar el método ToString() en la clase que consideres, y responder a esta pregunta, ¿para qué 
sirve?

Implementa, finalmente, una clase principal con un método Main para probar el funcionamiento de las tres clases; crea varias tarjetas de distintos tipos, realiza cargos, abonos y transferencias; calcula los intereses tal y como ves en la siguiente salida por pantalla:

--- Mostramos datos de las tarjetas ---
Tarjeta Débito Número: 458796547852 Saldo Disponible: 1000.0
Tarjeta Crédito Número: 789456123654 Saldo Disponible: 3010.0
--- Realizamos cargos, abonos y mostramos ---
Tarjeta Débito Número: 458796547852 Saldo Disponible: 2000.0
Tarjeta Crédito Número: 789456123654 Saldo Disponible: 2510.0
--- Aplicamos intereses ---
Tarjeta Débito Número: 458796547852 Saldo Disponible: 1975.0
Tarjeta Crédito Número: 789456123654 Saldo Disponible: 2435.5
