package hilmibaskoparan.dao;

import hilmibaskoparan.dto.RegisterDto;
import hilmibaskoparan.exception.ResourceNotFoundException;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Log4j2
public class RegisterDao implements IDaoConnection<RegisterDto> {

    // DATA ACCESS OBJECT (DAO)

    // CREATE
    @Override
    public void create(RegisterDto registerDto) throws SQLException, ClassNotFoundException{
        try (Connection connection = getInterfaceConnection()){
            // Connection Transaction Öncelikle Kapatmak
            connection.setAutoCommit(false);

            // INSERT
            String query = "insert into blog.register (name, surname, email, password) values (?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, registerDto.getName());
            statement.setString(2, registerDto.getSurname());
            statement.setString(3, registerDto.getEmail());
            statement.setString(4, registerDto.getPassword());

            // INSERT, TRANSACTION (Create, Delete, Update)
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0){
                log.info(RegisterDto.class + " INSERTION SUCCESSFUL");
                connection.commit();    // Transaction başarılıysa, işlem devam etsin
            } else {
                log.info(RegisterDto.class + " INSERTION FAILED");
                connection.rollback();  // Transaction başarısızsa, işlem devam etmesin
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // UPDATE
    @Override
    public void update(RegisterDto registerDto) {
        try (Connection connection = getInterfaceConnection()){
            // Connection Transaction Öncelikle Kapatmak
            connection.setAutoCommit(false);

            // UPDATE
            String query = "update blog.register set name=?, surname=?, email=?, password=? where id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, registerDto.getName());
            statement.setString(2, registerDto.getSurname());
            statement.setString(3, registerDto.getEmail());
            statement.setString(4, registerDto.getPassword());
            statement.setLong(5, registerDto.getId());

            // UPDATE, TRANSACTION (create, delete, update)
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0){
                log.info(RegisterDto.class + " UPDATE SUCCESSFUL");
                connection.commit();    // Transaction başarılıysa, işlem devam etsin
            } else {
                log.info(RegisterDto.class + " UPDATE FAILED");
                connection.rollback();  // Transaction başarısızsa, işlem devam etmesin
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // DELETE
    @Override
    public void delete(RegisterDto registerDto) {
        try (Connection connection = getInterfaceConnection()){
            // Connection Transaction Öncelikle Kapatmak
            connection.setAutoCommit(false);

            // DELETE
            String query = "delete from blog.register where id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, registerDto.getId());

            // DELETE, TRANSACTION (create, delete, update)
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                log.info(RegisterDto.class + " DELETE SUCCESSFUL");
                connection.commit();    // Transaction başarılıysa, işlem devam etsin
            } else {
                log.info(RegisterDto.class + " DELETE FAILED");
                connection.rollback();  // Transaction başarısızsa, işlem devam etmesin
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // LIST
    @Override
    public ArrayList<RegisterDto> list() {
        // ARRAY
        ArrayList<RegisterDto> registerDtoArrayList = new ArrayList<>();
        // DTO
        RegisterDto registerDto;

        try (Connection connection = getInterfaceConnection()){
            // SELECT
            String query = "select * from blog.register";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                registerDto = new RegisterDto();
                registerDto.setId(resultSet.getLong("id"));
                registerDto.setName(resultSet.getString("name"));
                registerDto.setSurname(resultSet.getString("surname"));
                registerDto.setEmail(resultSet.getString("email"));
                registerDto.setPassword(resultSet.getString("password"));
                registerDtoArrayList.add(registerDto);
            }
        } catch (SQLException sql) {
            sql.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return registerDtoArrayList;
    }

    @Override
    public RegisterDto findById(Long id) {
        RegisterDto registerDto = new RegisterDto();

        try (Connection connection = getInterfaceConnection()){
            String query = "select * from blog.register where id=" + id;
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                registerDto = new RegisterDto();
                registerDto.setId(resultSet.getLong("id"));
                registerDto.setName(resultSet.getString("name"));
                registerDto.setSurname(resultSet.getString("surname"));
                registerDto.setEmail(resultSet.getString("email"));
                registerDto.setPassword(resultSet.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(registerDto.getId() == null){
            throw new ResourceNotFoundException(id + " didn't find.");
        }
        return registerDto;
    }
}
