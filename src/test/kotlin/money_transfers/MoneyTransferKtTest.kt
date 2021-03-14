package money_transfers

import org.junit.Test

import org.junit.Assert.*
import java.io.StringReader

class MoneyTransferKtTest {

    @Test
    fun getCommision_forAccountTypeVKPay() {
        // arrange
        val accountType = "VK Pay"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(0.0, result, 0.0)

    }

    @Test
    fun getCommision_forAccountTypeMastercard() {
        // arrange
        val accountType = "Mastercard"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(26.0, result, 0.0)

    }

    @Test
    fun getCommision_forAccountTypeMastercardWhenPromotion() {
        // arrange
        promotion = true
        val accountType = "Mastercard"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(0.0, result, 0.0)

    }

    @Test
    fun getCommision_forAccountTypeMaestro() {
        // arrange
        val accountType = "Maestro"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(26.0, result, 0.0)

    }

    @Test
    fun getCommision_forAccountTypeMaestroWhenPromotion() {
        // arrange
        promotion = true
        val accountType = "Maestro"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(0.0, result, 0.0)

    }

    @Test
    fun getCommision_forAccountTypeVisa() {
        // arrange
        val accountType = "Visa"
        val sumPrevTransf = 1000.0
        val transfer = 100000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(750.0, result, 0.0)
    }

    @Test
    fun getCommision_forAccountTypeVisaMinFee() {
        // arrange
        val accountType = "Visa"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(35.0, result, 0.0)
    }

    @Test
    fun getCommision_forAccountTypeMir() {
        // arrange
        val accountType = "Мир"
        val sumPrevTransf = 1000.0
        val transfer = 100000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(750.0, result, 0.0)
    }

    @Test
    fun getCommision_forAccountTypeMirMinFee() {
        // arrange
        val accountType = "Мир"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(35.0, result, 0.0)
    }

    @Test
    fun getCommision_forAccountTypeNON() {
        // arrange
        val accountType = "xxx"
        val sumPrevTransf = 1000.0
        val transfer = 1000.0

        // act
        val result = getCommision(accountType,  sumPrevTransf, transfer)

        // assert
        assertEquals(0.0, result, 0.0)
    }

}