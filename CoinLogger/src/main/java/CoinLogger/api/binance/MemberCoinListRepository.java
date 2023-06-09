package CoinLogger.api.binance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberCoinListRepository extends JpaRepository<MemberCoin, String> {

    @Query(value = "select * from membercoinlist where coinName = :coinName and ownerId = :userId", nativeQuery = true)
    MemberCoin findByCoinName(@Param(value = "coinName") String coinName, @Param(value = "userId") String userId);
}
