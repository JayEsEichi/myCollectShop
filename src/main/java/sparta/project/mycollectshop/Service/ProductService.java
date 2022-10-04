package sparta.project.mycollectshop.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import sparta.project.mycollectshop.Dto.ProductMypriceRequestDto;
import sparta.project.mycollectshop.Dto.ProductRequestDto;
import sparta.project.mycollectshop.Entity.Product;
import sparta.project.mycollectshop.Repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product createProduct(ProductRequestDto requestDto) throws SQLException {
        // 요청받은 DTO 로 DB에 저장할 객체 만들기
        Product product = new Product(requestDto);
        productRepository.save(product);

        return product;
    }

    public Product updateProduct(Long id, ProductMypriceRequestDto requestDto) throws SQLException {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );

        int myprice = requestDto.getMyprice();
        product.setMyprice(myprice);
        productRepository.save(product);

        return product;
    }

    public List<Product> getProducts() throws SQLException {
        List<Product> products = productRepository.findAll();

        return products;
    }
}