val function1 = (x: Double) => -Math.pow(x, 2) + (8 * x) - 12
val function2 = (x: Double) => 3 * Math.pow(x, 2)
val function3 = (x: Double) => x + (2 * Math.pow(x, 2)) - Math.pow(x, 3) + (5 * Math.pow(x, 4))
val function4 = (x: Double) => (2 * x + 1) / (Math.pow(x, 2) + x)
val function5 = (x: Double) => Math.pow(Math.E, x)
val function6 = (x: Double) => 1 / Math.sqrt(x - 1)
val function7 = (x: Double) => 1 / (1 + Math.pow(x, 2))

def simpsonNormal(a:Int, b:Int, f:Double => Double) : Double = {
    (b-a)*((f(a)+4*f((a+b)/2)+f(b))/6)
}