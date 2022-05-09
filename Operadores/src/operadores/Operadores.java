package operadores;
public class Operadores {
    
    public static void main(String[] args) {
        int x = 10;        
        int y = 4;        
        
        int soma = x+y;
        System.out.println("Soma: " + soma);
        int sub = x-y;
        System.out.println("Subtração: " + sub);
        int mult = x*y;
        System.out.println("Multiplicação: " + mult);
        float div = (float) x/y;
        System.out.println("Divisão: " + div);
        int res = x % y;
        System.out.println("Resto: " + res);
        
        //Gera número aleatório
        System.out.println("\nGerador de número aleatório");
        double ale = Math.random(); //gera numero aleatório 0 até 1
        System.out.println("Nº aleatório: " + ale);
        int n = (int) (15 + ale * (50-15)); // numero aleatorio entre 15 e 50
        System.out.println(n);
        
        //Incremento Decremento
        System.out.println("\nIncremento Decremento");
        int z = 5;
        z++;
        System.out.println("Incremento ++: " + z);
        int h = 5;
        h--;
        System.out.println("Decremento --: " + h);
        
        //Operadores de Atribuição
        System.out.println("\nOperadores de Atribuição");
        System.out.println("x = " + x + " e y = " + y);
        x+=y; //x = x + y
        System.out.println("Somar e atribuir x += y: " + x);
        System.out.println("x = " + x + " e y = " + y);
        x-=y; //x = x - y
        System.out.println("Subtrair e atribuir x -= y: " + x);
        System.out.println("x = " + x + " e y = " + y);
        x*=y; // x = x * y
        System.out.println("Multiplicar e atribuir x *= y: " + x);
        System.out.println("x = " + x + " e y = " + y);
        x/=y;
        System.out.println("Dividir e atribuir x /= y: " + x);
        System.out.println("x = " + x + " e y = " + y);
        x%=y;
        System.out.println("Resto e atribuir x %= y: " + x);
        
        //Classe Math
        System.out.println("\nClasse Math");
        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Potência Math.pow(5,2): " + Math.pow(5,2));
        System.out.println("Raiz Quadrada Math.sqrt(25): " + Math.sqrt(25));
        System.out.println("Raiz Cúbica Math.cbrt(27): " + Math.cbrt(27));
        
        //Arredondamentos
        System.out.println("\nArredondamentos");
        System.out.println("Valor absoluto Math.abs(-10): " + Math.abs(-10));
        System.out.println("Arredondamento para baixo Math.floor(3.9): " + Math.floor(3.9));
        System.out.println("Arredondamento para cima Math.ceil(4.2): " + Math.ceil(4.2));
        System.out.println("Arredonda arimeticamente Math.round(5.6): " + Math.round(5.6));
        
        //Operador Ternário
        System.out.println("\nOperador Ternário");
        int n1, n2, r1, r2, r3;
        n1 = 4;
        n2 = 8;
        r1 = (n1 > n2) ? 0 : 1; // Se n1 > n2, r=0, else, r = 1
        System.out.println(r1);
        r2 = (n1 < n2) ? n1 : n2; //Outra forma
        System.out.println(r2);
        r3 = (n1 < n2) ? n1+n2 : n1-n2; //Outra forma
        System.out.println(r3);
        
        //Operadores Relacionais
        //>; <; >=; <=; == igual a; != diferente de
        
        //Comparação String
        System.out.println("\nComparação String");
        String nome1 = "Gustavo";
        String nome2, nome3;
        nome2 = "Gustavo";
        nome3 = new String("Gustavo");
        String compara;
        compara = (nome1==nome2)?"igual":"diferente";
        System.out.println(compara);
        compara = (nome2==nome3)?"igual":"diferente";
        System.out.println(compara);
        compara = (nome2.equals(nome3))?"igual":"diferente";
        System.out.println(compara);
        
        //Operadores Lógicos
        //&&; ||; ^ ou exclusivo; ! não
        System.out.println("\nOperadores Lógicos");
        int a, b, c;
        a = 4;
        b = 7;
        c = 12;
        boolean boo;
        boo = (a<b ^ b<c)?true:false;
        System.out.println(boo);
        
    }
    
}
