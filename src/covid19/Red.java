package covid19;

public class Red {
	
Nodo root;
	
	public void añadirPaciente (Paciente nuevoPaciente)
	{
		if (root == null) 
		{
			root = new Nodo(nuevoPaciente);
			return;
		}
		
		if (encontrarRepetido(nuevoPaciente)) 
		{
			System.out.println("Un usuario con el codigo " + nuevoPaciente.codigo + " ya esta registrado"
					+ "\n El usuario " + nuevoPaciente.nombre + " no fue añadido");
		}else {
			añadirPaciente(root, nuevoPaciente);
		}
	}
	
	private void añadirPaciente (Nodo root, Paciente nuevoPaciente)
	{
		if (root == null) 
		{
			return;
		}
		
		if (nuevoPaciente.codigo > root.paciente.codigo) 
		{
			if (root.derecha == null) 
			{
				root.derecha = new Nodo(nuevoPaciente);
			}else
			{
				añadirPaciente(root.derecha, nuevoPaciente);
			}
		}else
		{
			if (root.izquierda == null) 
			{
				root.izquierda = new Nodo(nuevoPaciente);
			}else
			{
				añadirPaciente(root.izquierda, nuevoPaciente);
			}
		}
	}
	
	public Paciente buscador(int codigo) 
    {
        return buscador(root, codigo);
    }

    private Paciente buscador(Nodo node, int codigo) 
    {

        if(node == null) {
            return null;
        }

        if(node.paciente.codigo == codigo){
            return node.paciente;
        }

        if(node.paciente.codigo < codigo) {
            return buscador(node.derecha, codigo);
        }

        return buscador(node.izquierda, codigo);
    }
    
    public boolean encontrarRepetido (Paciente x)
    {
    	Paciente encontrado = buscador(x.codigo);
    	if (encontrado != null) {
			return true;
		}
    	return false;
	}
    
    public void mostrarRed (Nodo root) {
		
    	System.out.println(root.paciente.nombre);
    	
    	if (root.izquierda != null) {
			mostrarRed(root.izquierda);
		}
    	if (root.derecha != null) {
			mostrarRed(root.derecha);
		}
	}
    
    
    public int cantidadSintomas (ListaSintoma l) 
	{
		int cont = 0;
		NodoLista tmp = l.head;
		while(tmp != null)
		{
			cont += 1; 
			tmp = tmp.next;
		}
		return cont;
	}
    
    int promedio;
    int cont;
    public void totalPagar (Nodo root) 
    {
    	Paciente x = new Paciente(root.paciente.nombre, root.paciente.codigo);
    	
		int cantSintomas = cantidadSintomas(root.paciente.listaSintomas);
		int total = cantSintomas * 100;
		System.out.println("El paciente " + root.paciente.nombre + " tiene " 
		+ cantSintomas + " sintoma (s)\n total a pagar: $" + total);
		
		promedio += total;
		cont += 1;
		
    	if (root.izquierda != null) {
			totalPagar(root.izquierda);
		}
    	if (root.derecha != null) {
			totalPagar(root.derecha);
		}
	}

}
