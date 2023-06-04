package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IFile;
import lombok.Data;

/**
 * Clase que representa un archivo.
 * Esta clase implementa la interfaz IFile.
 */
@Data
public class File implements IFile {
    /**
     * Nombre del archivo.
     */
    public String name;

    /**
     * Tamaño del archivo en bytes.
     */
    private long size;

    /**
     * Datos del archivo.
     */
    private byte[] data;

    /**
     * Tipo del archivo.
     */
    private String type;
}