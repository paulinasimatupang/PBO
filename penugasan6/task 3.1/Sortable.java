interface  Sortable{
	public abstract int compare(Sortable b);
	 
	public static void shell_sort(Sortable[] a) {
	        int n = a.length;
	        
	        // Calculate the gap (h) value for the Shell Sort
	        int h = 1;
	        while (h < n / 3) {
	            h = 3 * h + 1;
	        }
	        
	        // Perform the Shell Sort
	        while (h >= 1) {
	            for (int i = h; i < n; i++) {
	                // Insertion sort within the gap h
	                for (int j = i; j >= h && a[j].compare(a[j - h]) < 0; j -= h) {
	                    Sortable temp = a[j];
	                    a[j] = a[j - h];
	                    a[j - h] = temp;
	                }
	            }
	            h = h / 3;
	        }
	    }
	}

