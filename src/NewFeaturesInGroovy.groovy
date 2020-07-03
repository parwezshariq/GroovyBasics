/*

int[] opportunities = new int[] {500, 600, 700, 800, 900}

for (int opportunity in opportunities) {
	println opportunity
}

*/

/*

int[] opportunities = new int[] {500, 600, 700, 800, 900}

opportunities.each { println "${it}" }

*/

/*

int[] opportunities = new int[] {500, 600, 700, 800, 900}

opportunities.each((opportunity) -> { println opportunity })

*/

int[] opportunities = new int[] {500, 600, 700, 800, 900}

opportunities.each((opportunity) -> { 
	if (opportunity >= 700)
		println opportunity 
	})
