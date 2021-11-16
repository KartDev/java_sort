I den här uppgiften ska ni skriva en sorteringsmetod "sort" som tar en lista av tal (int) och sorterar dom. Listan
ges som argument till programmet vid körning. Sedan ska denna argumentlista konverteras från String[] till int[] i
SortMain.main metoden. Därefter ges till den konverterade listan till Sorter.sort metoden som sorterar listan och
returnerar den till SortMain.main som i sin tur printar ut den till terminalen.

$ java SortMain 76 11 -55 2 16 -21 7 88
=> -55 -21 2 7 11 16 76 88

Skalet för klassen Sorter kommer se ut som följande. Den tar en osorterad lista av typen int[] och returneras en
sorterad lista av samma typ.



Skalet för klassen SortMain kommer se ut som följande. Denna klass är den som exekveras när vi exekverar.
Ni ska också skriva en klass SortTest som testar ert program. I denna klass ska ni köra minst 5 olika tester med
olika testfall, negativa tal, 0 och positiva tal för att säkerställa att er sorteringsalgoritm fungerar för alla möjliga
listor av tal.
