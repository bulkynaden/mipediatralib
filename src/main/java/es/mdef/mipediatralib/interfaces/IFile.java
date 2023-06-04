package es.mdef.mipediatralib.interfaces;

/**
 * Interfaz que representa un archivo.
 */
public interface IFile {
    /**
     * Método que devuelve el nombre del archivo.
     *
     * @return nombre del archivo.
     */
    String getName();

    /**
     * Método que asigna el nombre del archivo.
     *
     * @param name nombre del archivo.
     */
    void setName(String name);

    /**
     * Método que devuelve el tamaño del archivo en bytes.
     *
     * @return tamaño del archivo en bytes.
     */
    long getSize();

    /**
     * Método que asigna el tamaño del archivo en bytes.
     *
     * @param size tamaño del archivo en bytes.
     */
    void setSize(long size);

    /**
     * Método que devuelve los datos del archivo.
     *
     * @return datos del archivo.
     */
    byte[] getData();

    /**
     * Método que asigna los datos del archivo.
     *
     * @param data datos del archivo.
     */
    void setData(byte[] data);

    /**
     * Método que devuelve el tipo del archivo.
     *
     * @return tipo del archivo.
     */
    String getType();

    /**
     * Método que asigna el tipo del archivo.
     *
     * @param type tipo del archivo.
     */
    void setType(String type);
}