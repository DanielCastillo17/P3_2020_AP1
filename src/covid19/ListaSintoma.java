package covid19;

public class ListaSintoma {
	
NodoLista head;
	
	void insertar(Sintoma s)
	{
		NodoLista nuevoNodo = new NodoLista();
		nuevoNodo.sintoma = s;
		
		
		if(head == null) 
		{
			head = nuevoNodo;
		}
		else 
		{ 
			NodoLista ultimo = head;
			
			while(ultimo.next != null) 
			{
				ultimo = ultimo.next;			
			}
			ultimo.next = nuevoNodo;
		}
	}
	
}



